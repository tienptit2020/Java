package com.example.demo.service;

import com.example.demo.dto.ProductDTO;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo ;

    public Product convertDTO (ProductDTO productDTO){
        Product product =new ModelMapper().map(productDTO,Product.class);
        System.out.println(product);
        return product ;
    }
    //them
    public void create (ProductDTO productDTO){
     Product product = convertDTO(productDTO);
     productRepo.save(product);
    }

    //sua
    //xoa
    //tim kiem

}
