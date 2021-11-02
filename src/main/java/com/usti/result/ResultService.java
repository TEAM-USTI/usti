package com.usti.result;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class ResultService {
    private final ResultRepository resultRepository;

    @Transactional(readOnly = true)
    public long count() {
        return resultRepository.count();
    }

    @Transactional
    public void save(Result result) {
        resultRepository.save(result);
    }
}