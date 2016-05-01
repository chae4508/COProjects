/**
 * 
 */
package com.autoad.app.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.autoad.app.service.UserService;

/**
 * @author calif74
 *
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "userService")
	private UserService userService;

	@RequestMapping(value = "getUserCnt.do")
	public String getUserCnt(Map<String, Object> commandMap, Model model) throws Exception {
		model.addAttribute("userCnt", userService.getUserCnt());
		return "user/getUserCnt";
	}
}
