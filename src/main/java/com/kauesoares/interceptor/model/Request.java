package com.kauesoares.interceptor.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.http.HttpMethod;

import java.time.ZonedDateTime;
import java.util.Map;

@RedisHash("request")
public record Request(
        @Id String projectIdentifier,
        ZonedDateTime date,
        HttpMethod method,
        Map<String, String> headers,
        Map<String, Object> body
) {
}
