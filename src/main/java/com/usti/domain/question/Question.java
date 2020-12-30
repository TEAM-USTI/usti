package com.usti.domain.question;

import com.usti.domain.choice.Choice;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class Question {
    @Id
    private int qid;

    @Column(length = 100, nullable = false)
    private String content;

    @OneToMany
    @JoinColumn(name="qid")
    private List<Choice> choice;
}