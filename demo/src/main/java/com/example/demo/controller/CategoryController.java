package com.example.demo.controller;

import com.example.demo.dto.CategoryDTO;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService ;
    @PostMapping("/")
    public ResponseDTO<Void> create (@RequestBody CategoryDTO categoryDTO) {
    categoryService.create(categoryDTO);
    return ResponseDTO.<Void>builder()
            .status(200)
            .msg("create")
            .build();

    }
}
