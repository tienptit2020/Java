package com.example.demo.dto;
import com.example.demo.entity.Category;
import com.example.demo.entity.ProductColor;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;
@Data
public class ProductDTO {
    private Integer id;
    private String name;
    private int price;
    private String image;// URL
    private String description;
    private List<ProductColor> productColors;
    @JsonFormat(pattern = "dd/MM/yyyy", timezone = "Asia/Ho_Chi_Minh")
    private Date createDate ;
    private MultipartFile file;
    private Category category;
}
