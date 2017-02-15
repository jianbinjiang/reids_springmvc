package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author jiangjianbin 2016/8/30.
 *
 */
@ApiModel(value = "QueryPendingFeesRequest", description = "门诊待缴费查询请求参数")
@JsonRootName("request")
public class QueryPendingFeesRequest extends RequestBase{
	
}
