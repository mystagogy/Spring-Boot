package com.example.jpa.service;

import com.example.jpa.dto.ExampleReqDTO;
import com.example.jpa.dto.ExampleResDTO;
import com.example.jpa.entity.Example;
import com.example.jpa.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExampleService {

    @Autowired
    ExampleRepository repo;

    public ExampleResDTO merge(ExampleReqDTO req){

        Example example = req.toEntity();
        example = repo.save(example);

        return new ExampleResDTO(example.getName());
    }

    public List<ExampleResDTO> selectAll(){

        List<Example> result = repo.findAll();

        List<ExampleResDTO> resList = result.stream()
                .map(example->new ExampleResDTO(example.getName()))
                .collect(Collectors.toList());

        return resList;
    }

    public ExampleResDTO selectOne(ExampleReqDTO req){
        Example example = repo.findById(req.getId()).orElse(null);

        return new ExampleResDTO(example.getName());
    }
}
