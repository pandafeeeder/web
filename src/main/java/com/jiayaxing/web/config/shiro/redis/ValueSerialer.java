package com.jiayaxing.web.config.shiro.redis;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.serializer.support.DeserializingConverter;
import org.springframework.core.serializer.support.SerializingConverter;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

public class ValueSerialer implements RedisSerializer<Object> {
    private Converter<Object, byte[]> serializer = new SerializingConverter();//序列化器
    private Converter<byte[], Object> deserializer = new DeserializingConverter();//反序列化器
    @Override
    public byte[] serialize(Object o) throws SerializationException {
        if (o == null) return new byte[0];
        try {
            return serializer.convert(o);
        } catch (Exception e) {
            e.printStackTrace();
            return new byte[0];
        }

    }

    @Override
    public Object deserialize(byte[] bytes) throws SerializationException {
        if (bytes == null || bytes.length == 0) return null;
        try {
            return deserializer.convert(bytes);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
