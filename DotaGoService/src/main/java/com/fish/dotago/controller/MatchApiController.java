package com.fish.dotago.controller;

import com.fish.dotago.client.match.rep.GetMatchDetailRep;
import com.fish.dotago.client.match.rep.GetMatchHistoryRep;
import com.fish.dotago.client.match.req.GetMatchDetailReq;
import com.fish.dotago.client.match.req.GetMatchHistoryReq;
import com.fish.dotago.service.MatchApiService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author cyy
 * @date 2017年12月14日
 * <p>
 * match's controller
 */
@RestController
@RequestMapping("/match")
public class MatchApiController {

    @Resource
    private MatchApiService steamAPIService;

    @RequestMapping("/getMatchHistoryByAccountId")
    public GetMatchHistoryRep getMatchHistoryByAccountId(@RequestBody GetMatchHistoryReq getMatchHistoryReq) {
        return steamAPIService.getMatchHistoryByAccountId(getMatchHistoryReq);
    }

    @RequestMapping("/getMatchDetailByMatchId")
    public GetMatchDetailRep getMatchDetailByMatchId(@RequestBody GetMatchDetailReq getMatchDetailReq) {
        return steamAPIService.getMatchDetailByMatchId(getMatchDetailReq);
    }

}
