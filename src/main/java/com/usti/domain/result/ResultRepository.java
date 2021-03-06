package com.usti.domain.result;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultRepository extends JpaRepository<Result, Integer> {
    long count();
    Result save(Result result);
}