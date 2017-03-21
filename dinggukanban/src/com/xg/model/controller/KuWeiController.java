package com.xg.model.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.xg.model.controller.base.BaseController;
import com.xg.model.service.KuWeiService;
import com.xg.model.util.PageData;
import com.xg.model.vo.KuWei;

/**********
 * 看板控制器(测试)
 * @author dd
 * @date 2017年3月1日
 **********/
@Controller
@RequestMapping("/kanban")
public class KuWeiController extends BaseController {
	@Autowired
	public KuWeiService kanBanService;
	
	@RequestMapping("/list")
	public ModelAndView list(){
		//logBefore(logger, "看板list");
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		try{
			pd = this.getPageData();
			List<String> varList = new ArrayList<>();
			varList.add("daidai");
			mv.setViewName("kanban1");
			mv.addObject("varList", varList);
			mv.addObject("pd", pd);
			mv.addObject("lkh","A");
		} catch(Exception e){
			logger.error(e.toString(), e);
		}
		//logAfter(logger);
		return mv;
	}
	@ResponseBody
	@RequestMapping("/findzt")
	public String findkwzt(String lkh){
		String result = null;
		try {
			List<KuWei> kws = kanBanService.listForLk(lkh);
			result = JSON.toJSONString(kws);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
