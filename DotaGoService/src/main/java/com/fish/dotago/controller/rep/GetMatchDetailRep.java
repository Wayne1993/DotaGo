package com.fish.dotago.controller.rep;

import com.fish.dotago.controller.model.MatchDetailResult;

/**
 * @ClassName: GetMatchDetailRep
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author: sdj
 * @date: Dec 14, 2017 12:08:44 PM
 * @Copyright: 2017 www.techsun.com.cn Inc. All rights reserved.
 */
public class GetMatchDetailRep extends BaseJsonRep {

	private MatchDetailResult matchDetailResult;

	public MatchDetailResult getMatchDetailResult() {
		return matchDetailResult;
	}

	public void setMatchDetailResult(MatchDetailResult matchDetailResult) {
		this.matchDetailResult = matchDetailResult;
	}

}
