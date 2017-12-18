package com.fish.dotago.client.match.req;

import lombok.Data;

@Data
public class GetMatchDetailReq extends BaseJsonReq {

    /**
     * 比赛id
     */
    private String matchId;
}
