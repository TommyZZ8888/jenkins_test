package com.www.zz.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Describtion: HelloController
 * @Author: 张卫刚
 * @Date: 2025/7/3 11:03
 */
@RestController("/hello")
public class HelloController {
	@RequestMapping("")
	public String hello() {
        return "Hello World!";
	}
}
