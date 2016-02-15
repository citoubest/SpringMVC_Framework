package com.citou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.citou.service.DemoService;

@Controller
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	DemoService demoService;

	@RequestMapping("/ajaxGetReq")
	@ResponseBody
	public ModelMap ajaxGetReqHandler()
	{

		String code = demoService.test();

		ModelMap map = new ModelMap();
		map.put("code", code);
		return map;
	}

}
