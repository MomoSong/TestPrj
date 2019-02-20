package com.michaelsong.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.michaelsong.test.service.TestService;
import com.michaelsong.test.vo.TestVo;

@Controller
public class TestController {

	@Autowired
	TestService testService;
	
	@RequestMapping("/list")
	public ModelAndView selectList() throws Exception {
		List<TestVo> list = testService.selectList();
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("testlist");
		mav.addObject("bList", list); 
		
		for(TestVo a : list) {
			System.out.println(a);
			System.out.println();
		}
		
		return mav;
	}
	
}
