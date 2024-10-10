package com.example.lab7.entity;

import jakarta.persistence.*;


@Entity

@Table(name="users")
public class Users {
    @Id
    @Column(name="id")
    private Integer id;
}
