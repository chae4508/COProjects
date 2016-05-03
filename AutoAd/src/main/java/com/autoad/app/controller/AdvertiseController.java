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

import com.autoad.app.service.AdvertiseService;

/**
 * @author miraichae
 *
 */
@Controller
@RequestMapping(value = "/advertise")
public class AdvertiseController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name= "advertiseService")
	private AdvertiseService advertiseService;
	
	@RequestMapping(value = "getAdCompList.do")
	public String getAdCompList(Map<String,Object> param, Model model) throws Exception{
		model.addAttribute("adCompList", advertiseService.getAdCompList());
		
		return "advertise/adCompList";
	}
	
}
