package com.example.demo.controller;

import com.example.demo.dto.ProductDTO;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("/product")
public class ProductController {
@Autowired
    ProductService service ;
    @Value("${upload.folder}")
    private String UPLOAD_FOLDER;
    // them
    @PostMapping("/")
    public ResponseDTO<Void> create (@ModelAttribute ProductDTO productDTO) throws IOException {
        if (productDTO.getFile() != null && !productDTO.getFile().isEmpty()) {
            if (!(new File(UPLOAD_FOLDER).exists())) { //check xem file da ton tai chua
                new File(UPLOAD_FOLDER).mkdirs();  // neu chua tao file moi
            }
            String filename = productDTO.getFile().getOriginalFilename();

            // lay dinh dang file
            String extension = filename.substring(filename.lastIndexOf("."));

            // tao ten moi
            String newFilename = UUID.randomUUID().toString() + extension;

            File newFile = new File(UPLOAD_FOLDER + newFilename);
            productDTO.getFile().transferTo(newFile);

            productDTO.setImage(newFilename);// save to db
        }
        service.create(productDTO);
      return ResponseDTO.<Void>builder()
              .msg("Create success")
              .status(200)
              .build();
     }

    //tim kiem theo name ;
    // sua
}
