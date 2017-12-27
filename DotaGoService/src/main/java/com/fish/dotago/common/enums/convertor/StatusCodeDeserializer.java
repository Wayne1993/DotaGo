package com.fish.dotago.common.enums.convertor;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fish.dotago.common.enums.StatusCode;

/**
 * @author Wayne
 * @date 2017年12月27日
 *
 */
public class StatusCodeDeserializer extends JsonDeserializer<StatusCode> {

	@Override
	public StatusCode deserialize(JsonParser arg0, DeserializationContext arg1)
			throws IOException, JsonProcessingException {
		for (StatusCode enumValue : StatusCode.values()) {
			if (enumValue.getCode().equals(arg0.getText())) {
				return enumValue;
			}
		}
		return null;
	}

}
