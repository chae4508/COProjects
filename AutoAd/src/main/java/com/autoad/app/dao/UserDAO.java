/**
 * 
 */
package com.autoad.app.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.autoad.app.common.db.AbstractDAO;
import com.autoad.app.vo.LoginVO;

/**
 * @author calif74
 *
 */
@Repository("userDAO")
public class UserDAO extends AbstractDAO {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
    public int getUserCnt(){
    	return (Integer)selectOne("userDAO.getUserListCount");
    }	
    
    public LoginVO canLogin(LoginVO login){
    	LoginVO rtnVal = new LoginVO();
    	
    	try{
    		rtnVal = (LoginVO)selectOne("userDAO.canLogin",login);
    		logger.debug("rtnVal : " + rtnVal.toString());
        	//rtnVal = (LoginVO)selectList("userDAO.canLogin",login);
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	return rtnVal;
    }
}
