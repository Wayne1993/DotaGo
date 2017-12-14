package com.fish.dotago.common.enums.convertor;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fish.dotago.common.enums.StatusCode;
public class StatusCodeSerializer extends JsonSerializer<StatusCode> {

	@Override
	public void serialize(StatusCode arg0, JsonGenerator arg1, SerializerProvider arg2)
			throws IOException, JsonProcessingException {
		arg1.writeString(arg0.getCode());
	}

}
