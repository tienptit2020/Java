package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO <T>{
    private int status; //200,400,500
    private String msg; //

    @JsonInclude(JsonInclude.Include.NON_NULL) // nếu trường nào bằng null sẽ loại bỏ
    private T data;

    public ResponseDTO(int status, String msg) {
        super();
        this.status = status;
        this.msg = msg;
    }
}
