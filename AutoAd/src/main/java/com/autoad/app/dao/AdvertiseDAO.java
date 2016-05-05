package com.autoad.app.dao;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.autoad.app.common.db.AbstractDAO;
import com.autoad.app.vo.AdCompListVO;

/**
 * @author miraichae
 *
 */
@Repository("advertiseDAO")
public class AdvertiseDAO extends AbstractDAO {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@SuppressWarnings("unchecked")
	public List<AdCompListVO> getAdCompList() {

		List<AdCompListVO> list = new ArrayList<AdCompListVO>();
		list = selectList("advertiseDAO.getAdCompList");

		return list;
	}

	public String regAdCompNm(AdCompListVO adCompListVo) {
		String regResult;
		AdCompListVO maxIdVo = new AdCompListVO();
		maxIdVo = (AdCompListVO) selectOne("advertiseDAO.getMaxId");
		adCompListVo.setId(maxIdVo.getMaxId());
		try {
			insert("advertiseDAO.regAdCompNm", adCompListVo);
			// 登録成功
			regResult = "1";
		} catch (Exception e) {
			// 登録失敗
			regResult = "0";
		}
		return regResult;
	}
	
	public AdCompListVO modSelAdCompNm(AdCompListVO adCompListVo){
		AdCompListVO result = new AdCompListVO();
		result = (AdCompListVO) selectOne("modSelAdCompNm", adCompListVo);
		return result;
	}
	
	public String modifyAdComp(AdCompListVO adCompListVo){
		String modResult;
		try{
			update("advertiseDAO.modifyAdCompNm", adCompListVo);
			modResult = "1";
		}catch(Exception e){
			modResult = "0";
		}
		return modResult;
	}
	
	public String delAdComp(AdCompListVO adCompListVo){
		String modResult;
		try{
			update("advertiseDAO.delAdComp", adCompListVo);
			modResult = "1";
		}catch(Exception e){
			modResult = "0";
		}
		return modResult;
	}
}
