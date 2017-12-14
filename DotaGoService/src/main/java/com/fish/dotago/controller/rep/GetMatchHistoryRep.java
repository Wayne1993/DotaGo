package com.fish.dotago.controller.rep;

import com.fish.dotago.controller.model.MatchHistoryResult;

public class GetMatchHistoryRep extends BaseJsonRep {

	private MatchHistoryResult matchHistoryResult;

	public MatchHistoryResult getMatchHistoryResult() {
		return matchHistoryResult;
	}

	public void setMatchHistoryResult(MatchHistoryResult matchHistoryResult) {
		this.matchHistoryResult = matchHistoryResult;
	}

}
