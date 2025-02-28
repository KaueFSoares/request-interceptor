package com.kauesoares.interceptor.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("project")
public record Project(
        @Id String identifier,
        String name
) {
    @Override
    public boolean equals(Object obj) {
        return
                obj instanceof Project &&
                        this.identifier.equals(((Project) obj).identifier);
    }
}
