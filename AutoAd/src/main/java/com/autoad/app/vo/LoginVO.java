/**
 * 
 */
package com.autoad.app.vo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author calif74
 *
 */
public class LoginVO {
	Logger logger = LoggerFactory.getLogger(this.getClass());
    private String loginId;
    
    private String loginPwd;
    
    private int canLogin;
    
    private String loginMsg;

	/**
	 * @return the loginId
	 */
	public String getLoginId() {
		return loginId;
	}

	/**
	 * @param loginId the loginId to set
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	/**
	 * @return the loginPwd
	 */
	public String getLoginPwd() {
		return loginPwd;
	}

	/**
	 * @param loginPwd the loginPwd to set
	 */
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public int getCanLogin() {
		return canLogin;
	}

	public void setCanLogin(int canLogin) {
		this.canLogin = canLogin;
	}

	public String getLoginMsg() {
		return loginMsg;
	}

	public void setLoginMsg(String loginMsg) {
		this.loginMsg = loginMsg;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LoginVO [loginId=" + loginId + ", loginPwd=" + loginPwd + ", canLogin=" + canLogin + ", loginMsg="
				+ loginMsg + "]";
	}
	
	public void printString(){
		logger.debug(toString());
	}
}
