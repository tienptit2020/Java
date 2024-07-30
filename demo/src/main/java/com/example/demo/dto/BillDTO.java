package com.example.demo.dto;

import com.example.demo.entity.BillItems;
import com.example.demo.entity.User;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

public class BillDTO {
    private Integer id;

    private String status;

    private User user;


    private List<BillItems> billItems;
}
