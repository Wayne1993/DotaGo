package com.fish.dotago.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.fish.dotago.common.Constants.APIConstants;
import com.fish.dotago.common.enums.StatusCode;
import com.fish.dotago.controller.model.MatchDetailResult;
import com.fish.dotago.controller.model.MatchHistoryResult;
import com.fish.dotago.controller.rep.GetMatchDetailRep;
import com.fish.dotago.controller.rep.GetMatchHistoryRep;
import com.fish.dotago.controller.req.GetMatchDetailReq;
import com.fish.dotago.controller.req.GetMatchHistoryReq;
import com.fish.dotago.http.HttpRequest;
import com.fish.dotago.mapper.Dota2HeroMapper;
import com.fish.dotago.mapper.Dota2ItemMapper;

//import net.sf.json.JSONObject;

/**
 * @author cyy
 * @date 2017年12月14日
 * 
 *       servie for matchAPI
 *
 */
@Service
public class MatchAPIService {

	@Autowired
	private Dota2HeroMapper dota2HerosMapper;
	@Autowired
	private Dota2ItemMapper dota2ItemMapper;

	private HttpRequest httpRequest = new HttpRequest();

	/**
	 * @ClassName: getMatchHistoryByAccountId
	 * @Description: TODO(通过数字Id获取最近500场比赛历史)
	 * @author: cyy
	 * @date: 2017年12月14日15:49:23
	 */
	public GetMatchHistoryRep getMatchHistoryByAccountId(GetMatchHistoryReq getMatchHistoryReq) {
		GetMatchHistoryRep getMatchHistoryRep = new GetMatchHistoryRep();

		try {
			String param = APIConstants.GET_MATCH_HISTORY_PARAM + getMatchHistoryReq.getAccountId();
			String result = httpRequest.sendGet(APIConstants.GET_MATCH_HISTORY_URL, param);
			
			MatchHistoryResult matchHistory = JSON.parseObject(result, new TypeReference<MatchHistoryResult>() {
			});
			getMatchHistoryRep.setMatchHistoryResult(matchHistory);

			getMatchHistoryRep.setCode(StatusCode.SUCCESS);
			getMatchHistoryRep.setMsg(StatusCode.SUCCESS.getDesc());
		} catch (Exception e) {
			getMatchHistoryRep.setCode(StatusCode.FAILED);
			getMatchHistoryRep.setMsg(StatusCode.FAILED.getDesc());
			e.printStackTrace();
		}
		return getMatchHistoryRep;
	}

	/**
	 * @ClassName: getMatchDetailByMatchId
	 * @Description: TODO(通过比赛Id获取最近比赛详情)
	 * @author: cyy
	 * @date: 2017年12月14日15:50:42
	 */
	public GetMatchDetailRep getMatchDetailByMatchId(GetMatchDetailReq getMatchDetailReq) {
		GetMatchDetailRep getMatchDetailRep = new GetMatchDetailRep();

		try {
			String param = APIConstants.GET_MATCH_DETAILS_PARAM + getMatchDetailReq.getMatchId();
			String result = httpRequest.sendGet(APIConstants.GET_MATCH_DETAILS_URL, param);

			MatchDetailResult matchDetail = JSON.parseObject(result, new TypeReference<MatchDetailResult>() {
			});
			getMatchDetailRep.setMatchDetailResult(matchDetail);

			getMatchDetailRep.setCode(StatusCode.SUCCESS);
			getMatchDetailRep.setMsg(StatusCode.SUCCESS.getDesc());
		} catch (Exception e) {
			getMatchDetailRep.setCode(StatusCode.FAILED);
			getMatchDetailRep.setMsg(StatusCode.FAILED.getDesc());
			e.printStackTrace();
		}
		return getMatchDetailRep;
	}

}
