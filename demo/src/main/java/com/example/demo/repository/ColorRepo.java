package com.example.demo.repository;

import com.example.demo.entity.Color;
import groovy.transform.Internal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRepo extends JpaRepository<Color, Internal> {
}
