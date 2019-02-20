package com.michaelsong.test.mapper;

import java.util.List;

import com.michaelsong.test.vo.TestVo;

public interface TestMapper {
	List<TestVo> selectList() throws Exception;
} 
