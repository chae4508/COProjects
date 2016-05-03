/**
 * 
 */
package com.autoad.app.common.db;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractDAO {
	protected Log log = LogFactory.getLog(AbstractDAO.class);

	@Autowired
	private SqlSessionTemplate sqlSession;

	protected void printQueryId(String queryId) {
		if (log.isDebugEnabled()) {
			log.debug("\t QueryId  \t:  " + queryId);
			log.debug("sql : \n" + sqlSession.getSqlSessionFactory().getConfiguration()
					.getMappedStatement(queryId, false).getBoundSql(null).getSql());
		}
	}

	protected void printQueryId(String queryId, Object params) {
		log.debug("\t QueryId  \t:  " + queryId);
		log.debug("sql : \n" + sqlSession.getSqlSessionFactory().getConfiguration().getMappedStatement(queryId)
				.getBoundSql(params).getSql());
	}

	public Object insert(String queryId, Object params) {
		printQueryId(queryId);
		return sqlSession.insert(queryId, params);
	}

	public Object update(String queryId, Object params) {
		printQueryId(queryId);
		return sqlSession.update(queryId, params);
	}

	public Object delete(String queryId, Object params) {
		printQueryId(queryId);
		return sqlSession.delete(queryId, params);
	}

	public Object selectOne(String queryId) {
		printQueryId(queryId);
		return sqlSession.selectOne(queryId);
	}

	public Object selectOne(String queryId, Object params) {
		try {
			printQueryId(queryId, params);
			Object result = sqlSession.selectOne(queryId, params);
			printQueryId(queryId, params);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("rawtypes")
	public List selectList(String queryId) {
		printQueryId(queryId);
		return sqlSession.selectList(queryId);
	}

	@SuppressWarnings("rawtypes")
	public List selectList(String queryId, Object params) {
		printQueryId(queryId,params);
		return sqlSession.selectList(queryId, params);
	}
}