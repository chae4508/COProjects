/**
 * 
 */
package com.autoad.app.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.autoad.app.vo.common.Menu;

/**
 * @author calif74
 *
 */
public class URIInterceptor extends HandlerInterceptorAdapter {
	protected Logger logger = LoggerFactory.getLogger(LoggerInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String requestURI = request.getRequestURI();

		if (!requestURI.startsWith("/app/login")) {
			request.setAttribute("menuList", Menu.getMenuList(requestURI));

			HttpSession session = request.getSession(false);
			if (session.getAttribute("loginInfo") == null) {
				logger.debug("not loginned");
				response.sendRedirect("/app/login/?returnUrl=" + requestURI);
				return false;
			}
		}

		return super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// 空実装
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// 空実装
	}
}
