package com.example.demo.service;

import com.example.demo.dto.CategoryDTO;
import com.example.demo.entity.Category;
import com.example.demo.repository.CategoryRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

@Service
public class CategoryService {
    @Autowired
    CategoryRepo categoryRepo ;
    public Category converDto(CategoryDTO categoryDTO){
        return new ModelMapper().map(categoryDTO,Category.class);
    }
    public void create (CategoryDTO categoryDTO){
        Category category = converDto(categoryDTO);
        categoryRepo.save(category);
    }
}
