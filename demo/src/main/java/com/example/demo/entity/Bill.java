package com.example.demo.entity;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Bill extends TimeAuditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String status;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "bill",cascade = CascadeType.ALL,
            orphanRemoval = true)// xoa hoac sua 1,2,.. phan tu trong billItems thi trong billItem cung duoc cap nhat
    // update bang billItem thong qua bill(it dung)
    private List<BillItems> billItems;

}