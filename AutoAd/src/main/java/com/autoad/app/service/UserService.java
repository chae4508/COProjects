/**
 * 
 */
package com.autoad.app.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.autoad.app.dao.UserDAO;

/**
 * @author calif74
 *
 */
@Service("userService")
public class UserService {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="userDAO")
	private UserDAO userDAO;
	
	public int getUserCnt(){
		return userDAO.getUserCnt();
	}
}
