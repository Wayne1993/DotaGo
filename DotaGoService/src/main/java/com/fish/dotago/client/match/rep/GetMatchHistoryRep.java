package com.fish.dotago.client.match.rep;

import com.fish.dotago.client.match.model.MatchHistoryResponse;
import lombok.Data;

@Data
public class GetMatchHistoryRep extends BaseJsonRep {

    private MatchHistoryResponse matchHistoryResponse;
}
