package com.fish.dotago.common.Constants;

import java.math.BigInteger;

public class APIConstants {

	/*
	 * Steam API Key
	 */
	public static final String KEY = "BCBB7D08E2266260C41253646133E110";

	/*
	 * 获取比赛历史API Url
	 */
	public static final String GET_MATCH_HISTORY_URL = "https://api.steampowered.com/IDOTA2Match_570/GetMatchHistory/V001/";

	/*
	 * 获取比赛历史API param
	 */
	public static final String GET_MATCH_HISTORY_PARAM = "?key=" + KEY + "&account_id=";

	/*
	 * 获取比赛详情API Url
	 */
	public static final String GET_MATCH_DETAILS_URL = "https://api.steampowered.com/IDOTA2Match_570/GetMatchDetails/V001/";

	/*
	 * 获取比赛详情API param
	 */
	public static final String GET_MATCH_DETAILS_PARAM = "?key=" + KEY + "&match_id=";
	
	/*
	 * steamId 64位，32位转换基数
	 */
	public static final BigInteger STEAMID_BIGINT = new BigInteger("76561197960265728");

}
