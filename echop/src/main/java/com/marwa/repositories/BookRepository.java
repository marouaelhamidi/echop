package com.marwa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marwa.models.Book;


public interface BookRepository extends JpaRepository<Book, Long> {
}