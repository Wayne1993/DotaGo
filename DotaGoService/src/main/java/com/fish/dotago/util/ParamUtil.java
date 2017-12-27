package com.fish.dotago.util;

import java.util.Map;
import java.util.Map.Entry;

import com.fish.dotago.client.match.req.BaseJsonReq;
import com.fish.dotago.common.constants.APIConstants;

/**
 * @author Wayne
 * @date 2017年12月27日
 *
 */
public class ParamUtil {

	public static String getParamByObject(BaseJsonReq baseJsonReq) {
		Map<String, String> map = baseJsonReq.getMap();
		StringBuffer sf = new StringBuffer();
		sf.append("?key=").append(APIConstants.KEY);
		for (Entry<String, String> entry : map.entrySet()) {
			sf.append("&").append(entry.getKey()).append("=").append(entry.getValue());
		}
		return sf.toString();
	}
}
