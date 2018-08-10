package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Login;
import com.service.LoginService;

@Controller
public class LoginController {

	@RequestMapping(value="welcome")
	public ModelAndView sayHello() {
		System.out.println("I Came here!");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display.jsp");
		return mav;
	} 
	
	@RequestMapping(value="check",method=RequestMethod.POST)
	public ModelAndView checkInfo(HttpServletRequest req) {
		System.out.println("check info");
		ModelAndView mav = new ModelAndView();
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		if(name.equals("Raju") && pass.equals("123")) {
			mav.setViewName("success.jsp");
		}else {
			mav.setViewName("failure.jsp");
		}
		return mav;
	} 
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="store",method=RequestMethod.POST)
	public ModelAndView storeInfo(HttpServletRequest req,Login ll) {
		String name = req.getParameter("name");
		String pass = req.getParameter("pass");
		
		ll.setName(name);
		ll.setPass(pass);
		
		int res = loginService.storeLoginDetails(ll);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.jsp");
		if(res>0) {
			//req.setAttribute("msg","Welcome");
			mav.addObject("msg", "successfully inserted");
		}else {
			mav.addObject("msg", "record not insert");
		}
		return mav;
	}
	
	@RequestMapping(value="loadData")
	public ModelAndView displayLoginInfo() {
		ModelAndView mav = new ModelAndView();
		List<Login> listOfData = loginService.getLoginDetails();
		mav.setViewName("displayData.jsp");
		mav.addObject("data", listOfData);
		return mav;
	}
	
	
}
