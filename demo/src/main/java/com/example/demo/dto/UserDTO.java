package com.example.demo.dto;

import com.example.demo.entity.Role;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

public class UserDTO {
    private int id;
    private int age;
    private String name;
    private String avatar;// url
    private String email;
    @Column(unique = true)
    private String username;
    private String password;
    private Date birthdate;
    private List<Role> roles;
}
