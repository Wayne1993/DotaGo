package com.fish.dotago.controller.req;

import java.math.BigInteger;

public class GetMatchDetailReq extends BaseJsonReq {

	private BigInteger matchId;

	public BigInteger getMatchId() {
		return matchId;
	}

	public void setMatchId(BigInteger matchId) {
		this.matchId = matchId;
	}

}
