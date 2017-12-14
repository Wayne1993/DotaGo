package com.fish.dotago.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fish.dotago.common.enums.StatusCode;
import com.fish.dotago.controller.model.MatchDetailAbilityUpgrades;
import com.fish.dotago.controller.model.MatchDetailPlayer;
import com.fish.dotago.controller.model.MatchDetailResponse;
import com.fish.dotago.controller.model.MatchDetailResult;
import com.fish.dotago.controller.model.MatchHistoryMatch;
import com.fish.dotago.controller.model.MatchHistoryPlayer;
import com.fish.dotago.controller.model.MatchHistoryResponse;
import com.fish.dotago.controller.model.MatchHistoryResult;
import com.fish.dotago.controller.rep.GetMatchDetailRep;
import com.fish.dotago.controller.rep.GetMatchHistoryRep;
import com.fish.dotago.controller.req.GetMatchDetailReq;
import com.fish.dotago.controller.req.GetMatchHistoryReq;
import com.fish.dotago.http.HttpRequest;
import com.fish.dotago.mapper.Dota2HeroMapper;
import com.fish.dotago.mapper.Dota2ItemMapper;

import net.sf.json.JSONObject;

/**
 * @author Wayne
 * @date 2017年12月13日
 * 
 * servie for hero
 *
 */
@Service
public class MatchAPIService {

	@Autowired
	private Dota2HeroMapper dota2HerosMapper;
	@Autowired
	private Dota2ItemMapper dota2ItemMapper;
	
	private HttpRequest httpRequest = new HttpRequest();
	
	public GetMatchHistoryRep getMatchHistoryByAccountId(GetMatchHistoryReq getMatchHistoryReq) {
		GetMatchHistoryRep getMatchHistoryRep = new GetMatchHistoryRep();
		
		try {
			String param = "?key=BCBB7D08E2266260C41253646133E110&account_id="+getMatchHistoryReq.getAccountId();
			String result = httpRequest.sendGet("https://api.steampowered.com/IDOTA2Match_570/GetMatchHistory/V001/",
					param);
			JSONObject json_test = JSONObject.fromObject(result);
			
			Map<String, Class> classMap = new HashMap<String, Class>();
			classMap.put("result", MatchHistoryResponse.class);
			classMap.put("matches", MatchHistoryMatch.class);
			classMap.put("players", MatchHistoryPlayer.class);
			MatchHistoryResult jb = (MatchHistoryResult) JSONObject.toBean(json_test, MatchHistoryResult.class, classMap);
			getMatchHistoryRep.setMatchHistoryResult(jb);
			getMatchHistoryRep.setCode(StatusCode.SUCCESS);
			getMatchHistoryRep.setMsg(StatusCode.SUCCESS.getDesc());
		} catch (Exception e) {
			getMatchHistoryRep.setCode(StatusCode.FAILED);
			getMatchHistoryRep.setMsg(StatusCode.FAILED.getDesc());
			e.printStackTrace();
		}
		return getMatchHistoryRep;
	}
	
	public GetMatchDetailRep getMatchDetailByMatchId(GetMatchDetailReq getMatchDetailReq) {
		GetMatchDetailRep getMatchDetailRep = new GetMatchDetailRep();
		String param = "?key=BCBB7D08E2266260C41253646133E110&match_id="+getMatchDetailReq.getMatchId();
		String result = httpRequest.sendGet("https://api.steampowered.com/IDOTA2Match_570/GetMatchDetails/V001/",
				param);
		
		JSONObject json_test = JSONObject.fromObject(result);
		Map<String, Class> classMap = new HashMap<String, Class>();
		classMap.put("result", MatchDetailResponse.class);
		classMap.put("players", MatchDetailPlayer.class);
		classMap.put("ability_upgrades", MatchDetailAbilityUpgrades.class);
		MatchDetailResult jb = (MatchDetailResult) JSONObject.toBean(json_test, MatchDetailResult.class, classMap);
		getMatchDetailRep.setMatchDetailResult(jb);
		return getMatchDetailRep;
	}
	
}
