package com.kauesoares.interceptor.controller;

import com.kauesoares.interceptor.dto.req.ProjectReqDTO;
import com.kauesoares.interceptor.dto.res.ProjectResDTO;
import com.kauesoares.interceptor.service.ProjectService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
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

    @GetMapping
    public List<ProjectResDTO> getAll() {
        return this.service.getAll();
    }

}
