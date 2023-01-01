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

    public void deleteOne(ExampleReqDTO req){
        repo.deleteById(req.getId());
    }

    public void deleteAll(){
        repo.deleteAll();
    }

    public List<ExampleResDTO> selectByName(ExampleReqDTO req){ //JPA에서는 생성자 생성보다는 builder 사용을 선호하고 반복문보다는 stream을 선호함.

        List<Example> result = repo.findByName(req.getName());

        List<ExampleResDTO> resList = result.stream()
                .map(example->new ExampleResDTO(example.getName()))
                .collect(Collectors.toList());

        return resList;
    }

    public List<ExampleResDTO> selectByNameStartWith(ExampleReqDTO req){ //JPA에서는 생성자 생성보다는 builder 사용을 선호하고 반복문보다는 stream을 선호함.

        List<Example> result = repo.findByNameStartingWith(req.getName());

        List<ExampleResDTO> resList = result.stream()
                .map(example->new ExampleResDTO(example.getName()))
                .collect(Collectors.toList());

        return resList;
    }

    public List<ExampleResDTO> selectByPrice(ExampleReqDTO req){ //JPA에서는 생성자 생성보다는 builder 사용을 선호하고 반복문보다는 stream을 선호함.

        List<Example> result = repo.findByPriceLessThan(req.getPrice());

        List<ExampleResDTO> resList = result.stream()
                .map(example->new ExampleResDTO(example.getName()))
                .collect(Collectors.toList());

        return resList;
    }

    public List<ExampleResDTO> selectByNameAndPrice(ExampleReqDTO req){ //JPA에서는 생성자 생성보다는 builder 사용을 선호하고 반복문보다는 stream을 선호함.

        List<Example> result = repo.findByNameAndPrice(req.getName(), req.getPrice());

        List<ExampleResDTO> resList = result.stream()
                .map(example->new ExampleResDTO(example.getName()))
                .collect(Collectors.toList());

        return resList;
    }
}
