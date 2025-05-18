package com.prajeshananthan.spring6webapp.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Prajesh AV
 * Date: 16/12/2024
 */

@Setter
@Getter
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    private Long id;
    private String name;
}