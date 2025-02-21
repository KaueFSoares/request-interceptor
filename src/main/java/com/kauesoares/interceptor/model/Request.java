package com.kauesoares.interceptor.model;

import org.springframework.http.HttpMethod;

import java.time.ZonedDateTime;
import java.util.Map;

public record Request(
        String projectIdentifier,
        ZonedDateTime date,
        HttpMethod method,
        Map<String, String> headers,
        Map<String, Object> body
) {
}
