package com.zhang.bruce.reqmerge;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;

import java.util.List;

public class FastJsonUtils {
	private static final SerializeConfig config;
	private static SerializeConfig localConfig = new SerializeConfig();

	public static String toJSONString(Object object) {
		return JSON.toJSONString(object, config, new SerializerFeature[0]);
	}

	public static String toJSONString(Object object, String daterFormat) {
		localConfig.put(java.util.Date.class, new SimpleDateFormatSerializer(daterFormat));
		localConfig.put(java.sql.Date.class, new SimpleDateFormatSerializer(daterFormat));
		return JSON.toJSONString(object, localConfig, new SerializerFeature[0]);
	}

	public static Object toBean(String text) {
		return JSON.parse(text);
	}

	public static <T> T toBean(String text, Class<T> clazz) {
		return JSON.parseObject(text, clazz);
	}

	public static <T> Object[] toArray(String text) {
		return toArray(text, null);
	}

	public static <T> Object[] toArray(String text, Class<T> clazz) {
		return JSON.parseArray(text, clazz).toArray();
	}

	public static <T> List<T> toList(String text, Class<T> clazz) {
		return JSON.parseArray(text, clazz);
	}

	static {
		config = new SerializeConfig();
		config.put(java.util.Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd HH:mm:ss"));
		config.put(java.sql.Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd HH:mm:ss"));
	}
}
