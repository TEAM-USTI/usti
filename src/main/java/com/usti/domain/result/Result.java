package com.usti.domain.result;

import com.usti.domain.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Result extends BaseTimeEntity {
    @Id
    private int rid;

    private int tid;
}