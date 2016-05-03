/**
 * 
 */
package com.autoad.app.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.autoad.app.service.UserService;
import com.autoad.app.vo.LoginVO;

/**
 * @author calif74
 *
 */
@Controller
@RequestMapping(value="/login")
public class LoginController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Resource
	UserService userService;
	
	@RequestMapping(value="index.do")
	public String index() throws Exception{
		
		return "login/index";
	}
	
	@RequestMapping(value="/getLoginInfo.do")
	@ResponseBody
	public LoginVO getLoginInfo(LoginVO login,Model model) throws Exception{
		LoginVO result = new LoginVO();
		
		result = userService.canLogin(login);
		return result;
	}
}
