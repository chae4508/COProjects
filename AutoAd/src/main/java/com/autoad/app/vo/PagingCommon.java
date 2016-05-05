package com.autoad.app.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/*
 * @author miraichae
 */
public class PagingCommon {

	int pageSize;
	int pageGroupSize;
	int currentPage;
	int startRow;
	int endRow;
	int totalCount = 0;
	int number = 0;
	int pageGroupCount;
	int numPageGroup;
	int pageTotal;
	int startPage;
	int endPage;
	int previewPage;
	int nextPage;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public HashMap<String, Object> pagingMake(String clickPageNo, String totalCount, List<AdCompListVO> adCorpList) {
		HashMap<String, Object> resultMap = new LinkedHashMap();
		HashMap<String, Integer> pageMap = new LinkedHashMap();

		// totalCount
		this.totalCount = Integer.parseInt(totalCount);
		pageMap.put("totalCount", this.totalCount);
		// 一つのページあたり表示する掲示数
		this.pageSize = 5;
		pageMap.put("pageSize", this.pageSize);
		// ページ番号
		if ("".equals(clickPageNo) || clickPageNo == null || "0".equals(clickPageNo)) {
			currentPage = 1;
		} else {
			this.currentPage = Integer.parseInt(clickPageNo);
		}
		pageMap.put("currentPage", this.currentPage);
		// 選択したページの開始行番号
		this.startRow = (currentPage - 1) * this.pageSize + 1;
		pageMap.put("startRow", this.startRow);
		// 選択したページの終了業番号
		this.endRow = currentPage * pageSize;
		pageMap.put("endRow", this.endRow);

		List<Object> commonList = new ArrayList();
		if (adCorpList != null) {
			if(startRow < adCorpList.size()){
				for (int i = startRow - 1; i < endRow; i++) {
					if ( i >= adCorpList.size()) {
						break;
					} else {
						commonList.add(adCorpList.get(i));
					}
				}
			}else if(startRow == adCorpList.size()){
				commonList.add(adCorpList.get(startRow-1));
			}
		} else {
			commonList = null;
		}
		pageTotal = this.totalCount / pageSize + (this.totalCount % pageSize == 0 ? 0 : 1);
		pageMap.put("pageTotal", pageTotal);
		// startPage
		startPage = 1;
		pageMap.put("startPage", startPage);
		// endPage
		endPage = pageTotal;
		pageMap.put("endPage", endPage);
		
		this.previewPage = currentPage - 1;
		this.nextPage = currentPage + 1;
		if(nextPage > pageTotal){
			nextPage = pageTotal;
		}
		pageMap.put("previewPage",previewPage);
		pageMap.put("nextPage", nextPage);
		resultMap.put("resultList", commonList);
		resultMap.put("pageMapParam", pageMap);

		return resultMap;

	}

}
