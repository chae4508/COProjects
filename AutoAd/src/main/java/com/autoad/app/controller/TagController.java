/**
 * 
 */
package com.autoad.app.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author calif74
 *
 */
@Controller
@RequestMapping(value="/tags")
public class TagController {
	@SuppressWarnings("unchecked")
	@RequestMapping(value="index.do")
	public String index(Model model,HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException{
		String refer = new String();
		String param = new String();
		StringBuffer sb = new StringBuffer();
		Enumeration<String> en = request.getParameterNames();
		
		refer = request.getHeader("Referer");
		sb.append("<script type='text/javascript'>¥r¥n");
		sb.append("var refer = '" + URLEncoder.encode(refer == null?"":refer,"UTF-8") + "';¥r¥n");
		while(en.hasMoreElements()){
			param = en.nextElement();
			sb.append("var "+ param + " = '" + URLEncoder.encode(request.getParameter(param)==null?"":request.getParameter(param),"UTF-8") + "';¥r¥n");
		}
		sb.append("</script>");
		model.addAttribute("rtnScr", sb.toString());
		return "tags/index";
	}
}
