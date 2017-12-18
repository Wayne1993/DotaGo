package com.fish.dotago.client.match.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class MatchHistoryResponse {
    @JSONField(name = "result")
    private MatchHistoryResult result;
}
