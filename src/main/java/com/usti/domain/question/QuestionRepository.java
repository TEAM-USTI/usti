package com.usti.domain.question;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.OrderBy;
import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
    @OrderBy("qid")
    List<Question> findAll();
}