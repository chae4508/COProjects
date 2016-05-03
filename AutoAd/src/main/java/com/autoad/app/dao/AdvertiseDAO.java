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
	public List<AdCompListVO> getAdCompList(){
		
		List<AdCompListVO> list = new ArrayList<AdCompListVO>();
		list = selectList("advertiseDAO.getAdCompList");
				
		return list;
	}
}
