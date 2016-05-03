package com.autoad.app.vo;
/*
 * @author miraichae
 */
public class PagingCommon {
	//ページ当表示されるリスト数
	private int pageListSize;
	//一番目ページ番号
	private int firstPageNo;
	//前選択したページ番号
	private int prevPageNo;
	//開始ページ
	private int startPageNo;
	//ページ番号
	private int pageNo;
	//終了ベージ番号
	private int endPageNo;
	//次のページ番号
	private int nextPageNo;
	//最後ページ番号
	private int finalPageNo;
	//掲示リスト全件数
	private int totalCount;
	/**
	 * @return the pageListSize
	 */
	public int getPageListSize() {
		return pageListSize;
	}
	/**
	 * @param pageListSize the pageListSize to set
	 */
	public void setPageListSize(int pageListSize) {
		this.pageListSize = pageListSize;
	}
	/**
	 * @return the firstPageNo
	 */
	public int getFirstPageNo() {
		return firstPageNo;
	}
	/**
	 * @param firstPageNo the firstPageNo to set
	 */
	public void setFirstPageNo(int firstPageNo) {
		this.firstPageNo = firstPageNo;
	}
	/**
	 * @return the prevPageNo
	 */
	public int getPrevPageNo() {
		return prevPageNo;
	}
	/**
	 * @param prevPageNo the prevPageNo to set
	 */
	public void setPrevPageNo(int prevPageNo) {
		this.prevPageNo = prevPageNo;
	}
	/**
	 * @return the startPageNo
	 */
	public int getStartPageNo() {
		return startPageNo;
	}
	/**
	 * @param startPageNo the startPageNo to set
	 */
	public void setStartPageNo(int startPageNo) {
		this.startPageNo = startPageNo;
	}
	/**
	 * @return the pageNo
	 */
	public int getPageNo() {
		return pageNo;
	}
	/**
	 * @param pageNo the pageNo to set
	 */
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	/**
	 * @return the endPageNo
	 */
	public int getEndPageNo() {
		return endPageNo;
	}
	/**
	 * @param endPageNo the endPageNo to set
	 */
	public void setEndPageNo(int endPageNo) {
		this.endPageNo = endPageNo;
	}
	/**
	 * @return the nextPageNo
	 */
	public int getNextPageNo() {
		return nextPageNo;
	}
	/**
	 * @param nextPageNo the nextPageNo to set
	 */
	public void setNextPageNo(int nextPageNo) {
		this.nextPageNo = nextPageNo;
	}
	/**
	 * @return the finalPageNo
	 */
	public int getFinalPageNo() {
		return finalPageNo;
	}
	/**
	 * @param finalPageNo the finalPageNo to set
	 */
	public void setFinalPageNo(int finalPageNo) {
		this.finalPageNo = finalPageNo;
	}
	/**
	 * @return the totalCount
	 */
	public int getTotalCount() {
		return totalCount;
	}
	/**
	 * @param totalCount the totalCount to set
	 */
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		this.makePaging();
	}
	
	private void makePaging(){
		//件数が無い場合
		if(this.totalCount==0)return;
		//ページ基本値設定
		if(this.pageNo==0)this.setPageNo(1);
		//一ページ当たり表示される件数基本設定
		if(this.pageListSize == 0)this.setPageListSize(10);
		//最後のページ番号
		int finalPage = (totalCount + (pageListSize - 1))/pageListSize;
		if(this.pageNo > finalPage)this.setPageNo(finalPage);
		if(this.pageNo< 0 || this.pageNo > finalPage)this.pageNo = 1;
		//startPage
		boolean isNowFirst = pageNo == 1?true:false;
		//endPage
		boolean isNowFinal = pageNo == finalPage ? true:false;
		int startPage = ((pageNo - 1)/10)*10+1;
		int endPage = startPage+10-1;
		
		if(endPage>finalPage){
			endPage = finalPage;
		}
		
		this.setFirstPageNo(1);
		
		if(isNowFirst){
			this.setPrevPageNo(1);
		}else{
			//前のページ番号
			this.setPrevPageNo(((pageNo - 1) < 1 ? 1:(pageNo - 1)));
		}
		this.setStartPageNo(startPage);
		this.setEndPageNo(endPage);
		if(isNowFinal){
			this.setNextPageNo(finalPage);
		}else{
			this.setNextPageNo(((pageNo + 1) > finalPage ? finalPage : (pageNo + 1))); 
		}
		this.setFinalPageNo(finalPage);
	}
}
