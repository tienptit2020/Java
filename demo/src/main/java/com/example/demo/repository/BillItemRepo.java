package com.example.demo.repository;

import com.example.demo.entity.BillItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillItemRepo extends JpaRepository<BillItems,Integer> {
}
