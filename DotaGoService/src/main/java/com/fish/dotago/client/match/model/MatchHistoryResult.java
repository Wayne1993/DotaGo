package com.fish.dotago.client.match.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

/**
 * @author Wayne
 * @date 2017年12月27日
 *
 */
@Data
public class MatchHistoryResult {

    @JSONField(name = "status")
    private String status;
    @JSONField(name = "num_results")
    private String numResults;
    @JSONField(name = "total_results")
    private String totalResults;
    @JSONField(name = "results_remaining")
    private String resultsRemaining;
    @JSONField(name = "matches")
    private List<MatchHistoryMatch> matches;

}