package com.fish.dotago.client.match.rep;

import com.fish.dotago.client.match.model.MatchHistoryResponse;
import lombok.Data;

/**
 * @author Wayne
 * @date 2017年12月27日
 *
 */
@Data
public class GetMatchHistoryRep extends BaseJsonRep {

    private MatchHistoryResponse matchHistoryResponse;
}
