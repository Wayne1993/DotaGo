package com.fish.dotago.client.match.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

/**
 * @author Wayne
 * @date 2017年12月27日
 *
 */
@Data
public class MatchHistoryMatch {

    /**
     *
     */
    @JSONField(name = "match_id")
    private String matchId;
    /**
     *
     */
    @JSONField(name = "match_seq_num")
    private String matchSeqNum;
    /**
     *
     */
    @JSONField(name = "start_time")
    private String startTime;
    /**
     *
     */
    @JSONField(name = "lobby_type")
    private String lobbyType;
    /**
     *
     */
    @JSONField(name = "radiant_team_id")
    private String radiantTeamId;
    /**
     *
     */
    @JSONField(name = "dire_team_id")
    private String direTeamId;
    /**
     *
     */
    @JSONField(name = "players")
    private List<MatchHistoryPlayer> players;
}
