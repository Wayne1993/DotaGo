package com.fish.dotago.common.constants;

import java.math.BigInteger;

/**
 * @author cyy
 * @date 2017年12月14日
 * 
 * API 常量
 */
public class ApiConstants {

	/*
	 * Steam API Key
	 */
	public static final String KEY = "BCBB7D08E2266260C41253646133E110";

	/*
	 * 获取比赛详情API param
	 */
	public static final String GET_MATCH_DETAILS_PARAM = "?key=" + KEY + "&match_id=";
	
	/*
	 * steamId 64位，32位转换基数
	 */
	public static final BigInteger STEAMID_BIGINT = new BigInteger("76561197960265728");

}
