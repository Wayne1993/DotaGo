package com.fish.dotago.service;

import com.alibaba.fastjson.JSON;
import com.fish.dotago.client.match.model.MatchDetailResponse;
import com.fish.dotago.client.match.model.MatchHistoryResponse;
import com.fish.dotago.client.match.rep.GetMatchDetailRep;
import com.fish.dotago.client.match.rep.GetMatchHistoryRep;
import com.fish.dotago.client.match.req.GetMatchDetailReq;
import com.fish.dotago.client.match.req.GetMatchHistoryReq;
import com.fish.dotago.common.constants.ApiConstants;
import com.fish.dotago.common.enums.StatusCode;
import com.fish.dotago.http.HttpRequest;
import com.fish.dotago.mapper.Dota2HeroMapper;
import com.fish.dotago.mapper.Dota2ItemMapper;
import com.fish.dotago.util.ParamUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author cyy
 * @date 2017年12月14日
 * <p>
 * servie for matchAPI
 */
@Service
public class MatchApiService {

	@Autowired
    private HttpRequest httpRequest;
    
	/**
	 * 获取比赛历史URL
	 */
    @Value("${dota2.url.get_match_history_url}")
    private String matchHistoryUrl;
    
    /**
	 * 获取比赛细节URL
	 */
    @Value("${dota2.url.get_match_details_url}")
    private String getMatchDetailsUrl;

    /**
     * @ClassName: getMatchHistoryByAccountId
     * @Description: TODO(通过数字Id获取最近500场比赛历史)
     * @author: cyy
     * @date: 2017年12月14日15:49:23
     */
    public GetMatchHistoryRep getMatchHistoryByAccountId(GetMatchHistoryReq getMatchHistoryReq) {
        GetMatchHistoryRep getMatchHistoryRep = new GetMatchHistoryRep();

        try {
            String param = ParamUtil.getParamByObject(getMatchHistoryReq);
            String result = httpRequest.sendGet(matchHistoryUrl, param);

            MatchHistoryResponse matchHistory = JSON.parseObject(result, MatchHistoryResponse.class);
            getMatchHistoryRep.setMatchHistoryResponse(matchHistory);

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
            String param = ParamUtil.getParamByObject(getMatchDetailReq);
            String result = httpRequest.sendGet(getMatchDetailsUrl, param);

            MatchDetailResponse matchDetail = JSON.parseObject(result, MatchDetailResponse.class);
            getMatchDetailRep.setMatchDetailResponse(matchDetail);

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
