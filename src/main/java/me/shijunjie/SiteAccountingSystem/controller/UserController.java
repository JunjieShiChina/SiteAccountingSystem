package me.shijunjie.SiteAccountingSystem.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;
import me.shijunjie.SiteAccountingSystem.common.Constant;
import me.shijunjie.SiteAccountingSystem.entity.TUser;
import me.shijunjie.SiteAccountingSystem.service.UserService;

@Controller
@Slf4j
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/toLogin", method = {RequestMethod.GET })
	public String toLogin() {
		return "view/login";
	}

	@RequestMapping(value = "/login", method = {RequestMethod.POST })
	public String login(String logname, String logpass, HttpServletRequest request) {
		log.info("UserController.login.param logname:{}", logname);
		TUser user = userService.getUser(logname, logpass);
		if(ObjectUtils.isEmpty(user)) {
			return "view/login";
		}
		request.getSession().setAttribute(Constant.USER_NAME, logname);
		request.getSession().setAttribute(Constant.OPERATE_TIME, request.getSession().getLastAccessedTime());
		return "view/index";
	}
	
	@RequestMapping(value = "/logOut", method = {RequestMethod.GET })
	public String logOut(HttpServletRequest request) {
		request.getSession().removeAttribute(Constant.USER_NAME);
		request.getSession().removeAttribute(Constant.OPERATE_TIME);
		return "view/login";
	}
}
