package com.fish.dotago.util;

import java.math.BigInteger;

public class GetSteamId {
	
	public String getSteamId(String id) {
		BigInteger j = new BigInteger(id);
		BigInteger i = new BigInteger("76561197960265728");
		BigInteger x = 	j.subtract(i);
		return x.toString();
	}
}
