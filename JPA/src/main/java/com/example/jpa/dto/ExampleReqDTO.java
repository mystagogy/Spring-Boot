package com.example.jpa.dto;

import com.example.jpa.entity.Example;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ExampleReqDTO {

    private Long id;
    private String name;
    private int price;

    public Example toEntity(){
        return Example.builder()
                .id(id)
                .name(name)
                .price(price)
                .build();
    }
}
