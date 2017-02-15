package com.cn.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import model.QueryPendingFeesRequest;
import model.QueryPendingFeesResponse;

/**
 * 
 * @author jiangjianbin
 * @date 创建时间: 2016年9月2日 门诊模块
 * @RestController = @Controller+@ResponseBody
 */
@RestController
@RequestMapping(path = "/PendingFees")
@Api(value = "", description = "门诊模块api",tags = "门诊模块api")
public class ClinicFeeRestful {

	/*
	 * 门诊待缴费查询
	 */
	@ApiOperation(value = "门诊待缴费查询", nickname = "门诊待缴费查询")
    @RequestMapping(method = RequestMethod.POST, value = "/QueryPendingFees")
	public QueryPendingFeesResponse QueryPendingFees(@RequestBody QueryPendingFeesRequest request) {
		QueryPendingFeesResponse response = new QueryPendingFeesResponse();
		return response;
	}

}
