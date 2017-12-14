/******************************************************************
 ** 文件名:StatusCodeDeserializer.java
 ** Copyright (c) 1999-2015 上海天臣防伪RFID中心软件部
 ** 创建人:cy
 ** 日　期:2017年10月15日
 ** 修改人:
 ** 日　期:
 ** 描　述:用于
 **
 ** 版　本:V1.0
 ******************************************************************/
package com.fish.dotago.common.enums.convertor;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fish.dotago.common.enums.StatusCode;

/**
 * @author cy
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
