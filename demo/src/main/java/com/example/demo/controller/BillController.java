package com.example.demo.controller;

import com.example.demo.dto.BillDTO;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class BillController {
    @Autowired
    BillService billService;
    @PostMapping("/")
    public ResponseDTO<Void> create (BillDTO billDTO){
        billService.create(billDTO);
        return ResponseDTO.<Void>builder()
                .status(200)
                .msg("create")
                .build();
    }
}
