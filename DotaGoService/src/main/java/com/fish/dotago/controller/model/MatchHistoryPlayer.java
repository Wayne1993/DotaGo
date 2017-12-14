package com.fish.dotago.controller.model;

import java.math.BigInteger;

public class MatchHistoryPlayer {

	private BigInteger account_id;
	private int player_slot;
	private int hero_id;

	public BigInteger getAccount_id() {
		return account_id;
	}

	public void setAccount_id(BigInteger account_id) {
		this.account_id = account_id;
	}

	public int getPlayer_slot() {
		return player_slot;
	}

	public void setPlayer_slot(int player_slot) {
		this.player_slot = player_slot;
	}

	public int getHero_id() {
		return hero_id;
	}

	public void setHero_id(int hero_id) {
		this.hero_id = hero_id;
	}

}
