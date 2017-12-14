package com.fish.dotago.controller.req;

public class GetMatchHistoryReq extends BaseJsonReq {

	private String accountId;

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

}
