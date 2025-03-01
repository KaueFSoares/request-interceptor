package com.kauesoares.interceptor.model;

import com.kauesoares.interceptor.dto.req.ProjectReqDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("project")
public record Project(
        @Id String identifier,
        String name
) {
    public Project(ProjectReqDTO dto) {
        this(dto.identifier(), dto.name());
    }

    @Override
    public boolean equals(Object obj) {
        return
                obj instanceof Project &&
                        this.identifier.equals(((Project) obj).identifier);
    }
}
