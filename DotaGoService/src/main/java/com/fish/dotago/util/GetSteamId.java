package com.fish.dotago.util;

import java.math.BigInteger;

import com.fish.dotago.common.constants.APIConstants;

/**
 * @author: cyy
 * @date: 2017年12月14日15:50:42
 * 
 * steamId32位64位转换
 */
public class GetSteamId {

	/**
	 * @ClassName: getSteamId32
	 * @Description: TODO(通过64位SteamId获取32位SteamId)
	 * @author: cyy
	 * @date: 2017年12月14日15:50:42
	 */
	public String getSteamId32(String steamId64) {
		BigInteger steamId64Int = new BigInteger(steamId64);
		BigInteger steamId32Int = steamId64Int.subtract(APIConstants.STEAMID_BIGINT);
		return steamId32Int.toString();
	}

	/**
	 * @ClassName: getSteamId64
	 * @Description: TODO(通过32位SteamId获取64位SteamId)
	 * @author: cyy
	 * @date: 2017年12月14日15:50:42
	 */
	public String getSteamId64(String steamId32) {
		BigInteger steamId32Int = new BigInteger(steamId32);
		BigInteger steamId64Int = steamId32Int.add(APIConstants.STEAMID_BIGINT);
		return steamId64Int.toString();
	}

}
