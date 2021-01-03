package com.usti.service;

import com.usti.domain.type.Type;
import com.usti.domain.type.TypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class TypeService {
    private final TypeRepository typeRepository;

    @Transactional(readOnly = true)
    public Type findByTid(int tid) {
        return typeRepository.findByTid(tid);
    }
}