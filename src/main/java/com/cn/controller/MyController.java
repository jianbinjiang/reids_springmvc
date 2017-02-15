package com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @author jiangjianbin
 * @date 创建时间: 2016年9月5日 
 *
 */
@Api(value = "", description = "MyController",tags="第一个demo")
@Controller
public class MyController {

	@ApiOperation(value = "第一个helloworld", nickname = "demo")
	@RequestMapping(value = "login",method = RequestMethod.GET) //用来处理前台的login请求  
    private @ResponseBody String hello(  
            @RequestParam(value = "username", required = false)String username,  
            @RequestParam(value = "password", required = false)String password  
            ){  
        return "Hello "+username+",Your password is: "+password;  
          
    }  
}
