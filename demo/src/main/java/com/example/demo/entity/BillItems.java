package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class BillItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Bill bill;

    @ManyToOne
    private Product product;

    private int quantity;
    private double price;

}