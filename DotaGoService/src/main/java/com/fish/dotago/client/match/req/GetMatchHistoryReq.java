package com.fish.dotago.client.match.req;

import lombok.Data;

@Data
public class GetMatchHistoryReq extends BaseJsonReq {

    /**
     * 账号Id
     */
    private String accountId;
}
