package com.kauesoares.interceptor.service;

import com.kauesoares.interceptor.repository.RequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RequestService {

    private final RequestRepository repository;

}
