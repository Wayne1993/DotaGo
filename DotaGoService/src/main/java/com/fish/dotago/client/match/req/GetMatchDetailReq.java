package com.fish.dotago.client.match.req;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;

/**
 * @author Wayne
 * @date 2017年12月27日
 *
 */
@Data
public class GetMatchDetailReq implements BaseJsonReq {

    /**
     * 比赛id
     */
    private String matchId;

	@Override
	public Map<String, String> getMap() {
		Map<String, String> map = new HashMap<>(16);
		if(!("".equals(matchId) || matchId == null)) {
			map.put("match_id", matchId);
		}
		
		return map;
	}
}
