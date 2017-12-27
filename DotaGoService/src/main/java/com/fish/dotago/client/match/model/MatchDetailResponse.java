package com.fish.dotago.client.match.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author Wayne
 * @date 2017年12月27日
 *
 */
@Data
public class MatchDetailResponse {

    @JSONField(name = "result")
    private MatchDetailResult result;
}
