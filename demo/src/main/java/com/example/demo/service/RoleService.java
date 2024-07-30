package com.example.demo.service;

import com.example.demo.dto.RoleDTO;
import com.example.demo.entity.Role;
import com.example.demo.repository.RoleRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    RoleRepo roleRepo ;
    public Role convertDTO (RoleDTO roleDTO){
        return new ModelMapper().map(roleDTO,Role.class);
    }
    public void create (RoleDTO roleDTO){
        roleRepo.save(convertDTO(roleDTO));
    }
}
