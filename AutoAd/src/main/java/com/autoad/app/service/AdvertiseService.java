/**
 * 
 */
package com.autoad.app.service;


import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.autoad.app.dao.AdvertiseDAO;
import com.autoad.app.vo.AdCompListVO;

/**
 * @author miraichae
 *
 */
@Service("advertiseService")
public class AdvertiseService {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name = "advertiseDAO")
	private AdvertiseDAO advertiseDAO;
	
	public List<AdCompListVO> getAdCompList(){
		return advertiseDAO.getAdCompList();
	}
	
}
