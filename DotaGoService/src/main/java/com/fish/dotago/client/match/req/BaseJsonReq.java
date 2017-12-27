package com.fish.dotago.client.match.req;

import java.util.Map;

/**
 * @author Wayne
 * @date 2017年12月27日
 *
 */
public interface BaseJsonReq {
	/**
	 * get this object's param map
	 * @return Map<String, String>
	 */
	public Map<String, String> getMap();
}
