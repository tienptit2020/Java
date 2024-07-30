package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;
@Entity
public class ProductColor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Product product;
    @ManyToOne
    private Color color;
    private int quantity;

    //1 product and 1 color has many image -> onetomany
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "product_images",
            joinColumns = @JoinColumn(name = "product_id"))

    @Column(name = "image")
    private List<String> images;// url
}
