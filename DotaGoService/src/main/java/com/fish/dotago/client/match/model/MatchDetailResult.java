package com.fish.dotago.client.match.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class MatchDetailResult {

    /**
     * 选手信息
     */
    @JSONField(name = "players")
    private List<MatchDetailPlayer> players;
    /**
     * 天辉获胜标志
     */
    @JSONField(name = "radiant_win")
    private boolean radiantWin;
    /**
     *
     */
    @JSONField(name = "duration")
    private String duration;
    @JSONField(name = "pre_game_duration")
    private String preGameDuration;
    @JSONField(name = "start_time")
    private String startTime;
    @JSONField(name = "match_id")
    private String matchId;
    @JSONField(name = "match_seq_num")
    private String matchSeqNum;
    @JSONField(name = "tower_status_radiant")
    private String towerStatusRadiant;
    @JSONField(name = "tower_status_dire")
    private String towerStatusDire;
    @JSONField(name = "barracks_status_radiant")
    private String barracksStatusRadiant;
    @JSONField(name = "barracks_status_dire")
    private String barracksStatusDire;
    @JSONField(name = "cluster")
    private String cluster;
    @JSONField(name = "first_blood_time")
    private String firstBloodTime;
    @JSONField(name = "lobby_type")
    private String lobbyType;
    @JSONField(name = "human_players")
    private String humanPlayers;
    @JSONField(name = "leagueid")
    private String leagueId;
    @JSONField(name = "positive_votes")
    private String positiveVotes;
    @JSONField(name = "negative_votes")
    private String negativeVotes;
    @JSONField(name = "game_mode")
    private String gameMode;
    @JSONField(name = "flags")
    private String flags;
    @JSONField(name = "engine")
    private String engine;
    @JSONField(name = "radiant_score")
    private String radiantScore;
    @JSONField(name = "dire_score")
    private String direScore;
}