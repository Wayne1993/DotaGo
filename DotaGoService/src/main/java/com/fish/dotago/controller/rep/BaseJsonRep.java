package com.fish.dotago.controller.rep;

import com.fish.dotago.common.enums.StatusCode;

/**
 * @author cyy
 *
 */
public class BaseJsonRep {
	private String msg;
	private StatusCode code;

	public BaseJsonRep() {
	}

	public BaseJsonRep(StatusCode code) {
		this.setCode(code);
		this.msg = code.getDesc();
	}

	public StatusCode getCode() {
		return code;
	}

	public void setCode(StatusCode code) {
		this.code = code;
		this.msg = code.getDesc();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
