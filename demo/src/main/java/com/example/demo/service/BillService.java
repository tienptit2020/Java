package com.example.demo.service;
import com.example.demo.dto.BillDTO;
import com.example.demo.entity.Bill;
import com.example.demo.repository.BillRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillService {
    @Autowired
    BillRepo billRepo ;
public Bill convertDTO (BillDTO billDTO){
    return new ModelMapper().map(billDTO,Bill.class);
}
public void create (BillDTO billDTO){
    Bill bill = convertDTO(billDTO);
}

}
