package com.fish.dotago.client.match.rep;

import com.fish.dotago.client.match.model.MatchDetailResponse;
import lombok.Data;

/**
 * @ClassName: GetMatchDetailRep
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author: sdj
 * @date: Dec 14, 2017 12:08:44 PM
 * @Copyright: 2017 www.techsun.com.cn Inc. All rights reserved.
 */
@Data
public class GetMatchDetailRep extends BaseJsonRep {

    private MatchDetailResponse matchDetailResponse;
}
