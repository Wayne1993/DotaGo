package com.fish.dotago.client.match.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class MatchDetailResponse {

    @JSONField(name = "result")
    private MatchDetailResult result;
}
