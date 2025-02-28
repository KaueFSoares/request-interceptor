package com.kauesoares.interceptor.repository;

import com.kauesoares.interceptor.model.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends CrudRepository<Request, Integer> {
}
