package com.fish.dotago.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Wayne
 * @date 2017年12月12日
 *
 * 测试的controller类
 */
@RestController
public class TestController {

	@RequestMapping("/")
	public String test() {
		return "hello world,my name is wayne";
	}
}
