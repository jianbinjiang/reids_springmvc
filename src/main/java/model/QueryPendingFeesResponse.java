package model;

import java.util.LinkedList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author jiangjianbin
 *门诊待缴费查询响应参数
 */
@ApiModel(value = "QueryPendingFeesResponse", description = "门诊待缴费查询响应参数")
@JsonRootName("response")
public class QueryPendingFeesResponse extends ResponseBase{
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
 
	/*
	 * 医院待缴费流水号
	 */
	@JsonProperty("prePayments")
	private List<QueryPendingFeesPrePayment> prePayments;

	@ApiModelProperty(notes = "医院待缴费流水号")
	public List<QueryPendingFeesPrePayment> getPrePayments() {
		return prePayments;
	}

	public void setPrePayments(List<QueryPendingFeesPrePayment> prePayments) {
		this.prePayments = prePayments;
	}
}
