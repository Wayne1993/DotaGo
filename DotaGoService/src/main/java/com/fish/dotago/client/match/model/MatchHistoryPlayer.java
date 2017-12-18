package com.fish.dotago.client.match.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class MatchHistoryPlayer {

    /**
     *账户Id
     */
    @JSONField(name = "account_id")
    private String accountId;
    /**
     *
     */
    @JSONField(name = "player_slot")
    private String playerSlot;
    /**
     * 英雄Id
     */
    @JSONField(name = "hero_id")
    private String heroId;

}
