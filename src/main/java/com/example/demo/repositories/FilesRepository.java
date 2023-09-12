package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Files;

public interface FilesRepository extends JpaRepository<Files, Integer> {

}
