package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Data
@Table(name = "user") // map to table SQL
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int age;
    private String name;
    private String avatar;// url
    private String email;
    @Column(unique = true)
    private String username;
    private String password;
    @Temporal(TemporalType.DATE)
    private Date birthdate;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name ="user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles;

}