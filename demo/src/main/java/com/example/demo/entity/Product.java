package com.example.demo.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Product extends TimeAuditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String name;
    private int price;
    private String image;// URL
    private String description;
    @OneToMany(mappedBy ="product",cascade = CascadeType.ALL)
    private List<ProductColor> productColors;
    @ManyToOne
    private Category category;

}