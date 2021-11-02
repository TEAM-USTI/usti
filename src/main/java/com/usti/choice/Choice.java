package com.usti.choice;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Choice {
    @Id
    private int cid;

    @Column
    private int qid;

    @Column(length = 100, nullable = false)
    private String content;

    @Column(length = 20, nullable = false)
    private String score;
}