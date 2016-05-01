/**
 * 
 */
package com.autoad.app.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.autoad.app.common.db.AbstractDAO;

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
}
