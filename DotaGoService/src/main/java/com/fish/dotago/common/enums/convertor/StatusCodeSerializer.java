/******************************************************************
 ** 文件名:StatusCodeSerializer.java
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

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fish.dotago.common.enums.StatusCode;

/**
 * @author cy
 *
 */
public class StatusCodeSerializer extends JsonSerializer<StatusCode> {

	@Override
	public void serialize(StatusCode arg0, JsonGenerator arg1, SerializerProvider arg2)
			throws IOException, JsonProcessingException {
		arg1.writeString(arg0.getCode());
	}

}
