package com.example.demo.service;

import com.example.demo.dto.ColorDTO;
import com.example.demo.entity.Color;
import com.example.demo.repository.ColorRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColorService {
    @Autowired
    ColorRepo colorRepo ;
    public Color converDto (ColorDTO colorDTO){
        return new ModelMapper().map(colorDTO,Color.class);
    }
    public void create(ColorDTO colorDTO){
        colorRepo.save(converDto(colorDTO));
    }
}
