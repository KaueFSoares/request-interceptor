package com.kauesoares.interceptor.dto.res;

import com.kauesoares.interceptor.model.Project;

public record ProjectResDTO(
        String identifier,
        String name
) {
    public ProjectResDTO(Project model) {
        this(model.identifier(), model.name());
    }
}
