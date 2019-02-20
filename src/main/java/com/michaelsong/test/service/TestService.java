package com.michaelsong.test.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.michaelsong.test.mapper.TestMapper;
import com.michaelsong.test.vo.TestVo;

@Service
public class TestService {
	
	@Autowired
	TestMapper testMapper;
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	public List<TestVo> selectList() throws Exception{
		List<TestVo> result = testMapper.selectList(); 
		
		logger.debug("HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
		
		return result;
	}
}
