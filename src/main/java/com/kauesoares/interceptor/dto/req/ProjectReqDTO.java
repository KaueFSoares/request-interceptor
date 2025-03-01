package com.kauesoares.interceptor.dto.req;

import jakarta.validation.constraints.NotBlank;

public record ProjectReqDTO(
        @NotBlank
        String identifier,
        String name
) {
}
