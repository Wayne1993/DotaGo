package com.fish.dotago.controller.model;

import java.math.BigInteger;
import java.util.List;

public class MatchHistoryMatch {

	private BigInteger match_id;
	private BigInteger match_seq_num;
	private BigInteger start_time;
	private int lobby_type;
	private BigInteger radiant_team_id;
	private BigInteger dire_team_id;
	private List<MatchHistoryPlayer> players;

	public BigInteger getMatch_id() {
		return match_id;
	}

	public void setMatch_id(BigInteger match_id) {
		this.match_id = match_id;
	}

	public BigInteger getMatch_seq_num() {
		return match_seq_num;
	}

	public void setMatch_seq_num(BigInteger match_seq_num) {
		this.match_seq_num = match_seq_num;
	}

	public BigInteger getStart_time() {
		return start_time;
	}

	public void setStart_time(BigInteger start_time) {
		this.start_time = start_time;
	}

	public int getLobby_type() {
		return lobby_type;
	}

	public void setLobby_type(int lobby_type) {
		this.lobby_type = lobby_type;
	}

	public BigInteger getRadiant_team_id() {
		return radiant_team_id;
	}

	public void setRadiant_team_id(BigInteger radiant_team_id) {
		this.radiant_team_id = radiant_team_id;
	}

	public BigInteger getDire_team_id() {
		return dire_team_id;
	}

	public void setDire_team_id(BigInteger dire_team_id) {
		this.dire_team_id = dire_team_id;
	}

	public List<MatchHistoryPlayer> getPlayers() {
		return players;
	}

	public void setPlayers(List<MatchHistoryPlayer> players) {
		this.players = players;
	}

}
