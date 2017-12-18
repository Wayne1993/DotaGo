package com.fish.dotago.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fish.dotago.client.match.rep.GetMatchDetailRep;
import com.fish.dotago.client.match.rep.GetMatchHistoryRep;
import com.fish.dotago.client.match.req.GetMatchDetailReq;
import com.fish.dotago.client.match.req.GetMatchHistoryReq;
import com.fish.dotago.service.MatchAPIService;

/**
 * @author cyy
 * @date 2017年12月14日
 * 
 * match's controller
 *
 */
@RestController
public class MatchAPIController {

	@Resource
	private MatchAPIService steamAPIService;
	
	@RequestMapping("/getMatchHistoryByAccountId")
	public @ResponseBody GetMatchHistoryRep getMatchHistoryByAccountId(@RequestBody GetMatchHistoryReq getMatchHistoryReq) {
		return steamAPIService.getMatchHistoryByAccountId(getMatchHistoryReq);
	}
	
	@RequestMapping("/getMatchDetailByAccountId")
	public @ResponseBody GetMatchDetailRep getMatchDetailByAccountId(@RequestBody GetMatchDetailReq getMatchDetailReq) {
		return steamAPIService.getMatchDetailByMatchId(getMatchDetailReq);
	}
	
}
