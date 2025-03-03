package com.kauesoares.interceptor.service;

import com.kauesoares.interceptor.dto.req.ProjectReqDTO;
import com.kauesoares.interceptor.dto.res.ProjectResDTO;
import com.kauesoares.interceptor.model.Project;
import com.kauesoares.interceptor.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository repository;

    public ProjectResDTO saveProject(ProjectReqDTO dto) {
        Project project = new Project(dto);

        this.repository.save(project);

        return new ProjectResDTO(project);
    }

    public List<ProjectResDTO> getAll() {
        return StreamSupport.stream(this.repository.findAll().spliterator(), true)
                .map(ProjectResDTO::new)
                .toList();
    }

}
