package com.usti.domain.type;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Type {
    @Id
    private int tid;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 500, nullable = false)
    private String description;
}