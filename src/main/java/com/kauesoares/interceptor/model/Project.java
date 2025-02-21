package com.kauesoares.interceptor.model;

public record Project(
        String identifier,
        String name
) {
    @Override
    public boolean equals(Object obj) {
        return
                obj instanceof Project &&
                        identifier.equals(((Project) obj).identifier);
    }
}
