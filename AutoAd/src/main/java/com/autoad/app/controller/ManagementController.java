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
@RequestMapping(value="/management")
public class ManagementController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value="manageUrl.do")
	public String manageUrl(){
		return "manage/manageUrl";
	}
}
