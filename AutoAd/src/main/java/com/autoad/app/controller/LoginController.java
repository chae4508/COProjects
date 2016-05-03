/**
 * 
 */
package com.autoad.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author calif74
 *
 */
@Controller
@RequestMapping(value="/login")
public class LoginController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value="index.do")
	public String index() throws Exception{
		
		return "login/index";
	}
	
	/*@RequestMapping(value="/getLoginInfo.do")
	public String getLoginInfo(LoginVO login,Model model) throws Exception{
		
	}*/
}
