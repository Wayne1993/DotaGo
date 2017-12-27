package com.fish.dotago.client.match.req;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import lombok.Data;

/**
 * @author Wayne
 * @date 2017年12月27日
 *
 */
@Data
public class GetMatchHistoryReq implements BaseJsonReq {
	/**
	 * 英雄ID
	 */
	private String heroId;
	
	/**
	 * 游戏模式
	 */
	private String gameMode;
	
	/**
	 * The average skill range of the match, these can be [1-3] with lower numbers being lower skill. Ignored if an account ID is specified
	 */
	private String skill;
	
	/**
	 * Minimum number of human players that must be in a match for it to be returned
	 */
	private String minPlayers;
	
	/**
	 * An account ID to get matches from. This will fail if the user has their match history hidden
	 */
	private String accountId;
	
	/**
	 * The league ID to return games from
	 */
	private String leagueId;
	
	/**
	 * The minimum match ID to start from
	 */
	private String startAtMatchId;
	
	/**
	 * The number of requested matches to return
	 */
	private String matchesRequested;
	
	/**
	 * Whether or not tournament games should only be returned
	 */
	private String tournamentGamesOnly;

	@Override
	public Map<String, String> getMap() {
		Map<String, String> map = new HashMap<>(16);
		if(!("".equals(heroId) || heroId == null)) {
			map.put("hero_id", heroId);
		}
		if(!("".equals(gameMode) || gameMode == null)) {
			map.put("game_mode", gameMode);
		}
		if(!("".equals(skill) || skill == null)) {
			map.put("skill", skill);
		}
		if(!("".equals(minPlayers) || minPlayers == null)) {
			map.put("min_players", minPlayers);
		}
		if(!("".equals(accountId) || accountId == null)) {
			map.put("account_id", accountId);
		}
		if(!("".equals(leagueId) || leagueId == null)) {
			map.put("league_id", leagueId);
		}
		if(!("".equals(startAtMatchId) || startAtMatchId == null)) {
			map.put("start_at_match_id", startAtMatchId);
		}
		if(!("".equals(matchesRequested) || matchesRequested == null)) {
			map.put("matches_requested", matchesRequested);
		}
		if(!("".equals(tournamentGamesOnly) || tournamentGamesOnly == null)) {
			map.put("tournament_games_only", tournamentGamesOnly);
		}
		
		return map;
	}
}
