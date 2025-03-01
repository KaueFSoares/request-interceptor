package com.kauesoares.interceptor.controller;

import com.kauesoares.interceptor.dto.req.ProjectReqDTO;
import com.kauesoares.interceptor.dto.res.ProjectResDTO;
import com.kauesoares.interceptor.service.ProjectService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Controller
@RequestMapping("/projects")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService service;

    @PostMapping
    public ResponseEntity<ProjectResDTO> saveProject(
            @Valid
            @RequestBody
            ProjectReqDTO dto,
            UriComponentsBuilder uriComponentsBuilder
    ) {
        ProjectResDTO res = this.service.saveProject(dto);

        URI uri = uriComponentsBuilder.path("/projects/{identifier}").buildAndExpand(res.identifier()).toUri();

        return ResponseEntity.created(uri).body(res);
    }

}
