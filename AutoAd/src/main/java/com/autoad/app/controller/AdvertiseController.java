/**
 * 
 */
package com.autoad.app.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.autoad.app.service.AdvertiseService;
import com.autoad.app.vo.AdCompListVO;
import com.autoad.app.vo.PagingCommon;

/**
 * @author miraichae
 *
 */
@Controller
@RequestMapping(value = "/advertise")
@SuppressWarnings({ "rawtypes", "unchecked"})
public class AdvertiseController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name= "advertiseService")
	private AdvertiseService advertiseService;
	
	@RequestMapping(value = "adCompList.do")
	public String getAdCompList(AdCompListVO adCompListVo, Model model) throws Exception{
		
		List<AdCompListVO> adCorpList = new ArrayList();
		HashMap<String,Object> resultMap = new LinkedHashMap();
		
		adCorpList = advertiseService.getAdCompList();
		String totalCount = adCorpList.get(0).getTotal();
		
		//ページング共通関数
		PagingCommon pageCommon = new PagingCommon();
		resultMap = pageCommon.pagingMake(adCompListVo.getClickPageNo(), totalCount, adCorpList);
		
		model.addAttribute("pageInfo", resultMap);
		
		return "advertise/adCompList";
	}
	@ResponseBody
	@RequestMapping(value = "regAdComp.do")
	public String regAdComp(AdCompListVO adCompListVo, Model model,HttpServletRequest request) throws Exception{
//		HttpSession session = request.getSession(false);
//		String loginInfo = session.getAttribute("loginInfo").toString();
		String result = advertiseService.regAdComp(adCompListVo);
		
		return result;
	}
	@ResponseBody
	@RequestMapping(value = "modSelAdComp.do")
	public AdCompListVO modSelAdCompNm(AdCompListVO adCompListVo,Model model,HttpServletRequest request) throws Exception{
		AdCompListVO result = new AdCompListVO();
		result = advertiseService.modSelAdCompNm(adCompListVo);
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "modifyAdComp.do")
	public String modifyAdComp(AdCompListVO adCompListVo,Model model,HttpServletRequest request) throws Exception{
		String result = advertiseService.modifyAdComp(adCompListVo);
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value = "delAdCompNm.do")
	public String delAdCompNm(AdCompListVO adCompListVo,Model model,HttpServletRequest request) throws Exception{
		String result = advertiseService.delAdComp(adCompListVo);
		return result;
	}
}
