package com.xg.model.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.xg.model.controller.base.BaseController;

/************************************************************
 * 
 * @author DaiJian
 * @date 2017年2月24日
 ***********************************************************/
@Controller
@RequestMapping("/test")
public class TestController extends BaseController {
	
	@RequestMapping("/t")
	@ResponseBody
	public String test1(){
		return "ttt";
	}
	@RequestMapping("/tt")
	public ModelAndView test2(HttpServletRequest req,HttpServletResponse res){
		ModelAndView ceshi = new ModelAndView();
		ceshi.addObject("name", "daidai");
		ceshi.setViewName("ceshi");
		return ceshi;
	}
	
}
