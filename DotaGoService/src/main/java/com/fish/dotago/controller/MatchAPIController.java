package com.fish.dotago.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fish.dotago.controller.rep.GetMatchDetailRep;
import com.fish.dotago.controller.rep.GetMatchHistoryRep;
import com.fish.dotago.controller.req.GetMatchDetailReq;
import com.fish.dotago.controller.req.GetMatchHistoryReq;
import com.fish.dotago.service.MatchAPIService;

/**
 * @author Wayne
 * @date 2017年12月13日
 * 
 * hero's controller
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
