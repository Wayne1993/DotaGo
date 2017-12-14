package com.fish.dotago.common.enums;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fish.dotago.common.enums.convertor.StatusCodeDeserializer;
import com.fish.dotago.common.enums.convertor.StatusCodeSerializer;

/**
 * @author cyy
 * @date 2017年12月14日
 * 
 * 接口返回码
 */
@JsonSerialize(using = StatusCodeSerializer.class)
@JsonDeserialize(using = StatusCodeDeserializer.class)
public enum StatusCode {
	SUCCESS("0000", "接口调用成功"),
	FAILED("10001", "接口调用失败"),
	CUSTOM_DATA_EXP("10002", "业务数据异常"),
	PARAM_REQUIRED("10003","接口必填项为空"),
	PARAM_NULL("10004","输入对象为空"),
	DNS_LIMIT("10005","局域网限制"),
	PARAM_ERROR("10006","输入对象格式不正确"),
	CLIENT_UNKNOW("10007","未知平台"),
	TOKEN_INVALID("10008","Token失效"),
	LOGIN_FAILED("10009","登录失败"),
	NO_PERMISSION("10013","权限不足"),;
	
	private String code;
	private String desc;

	private StatusCode(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}
}
