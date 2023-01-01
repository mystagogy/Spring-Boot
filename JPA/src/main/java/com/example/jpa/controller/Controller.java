package com.example.jpa.controller;

import com.example.jpa.dto.ExampleReqDTO;
import com.example.jpa.dto.ExampleResDTO;
import com.example.jpa.entity.Example;
import com.example.jpa.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    ExampleService es;

    @GetMapping("/insert")
    public ExampleResDTO insertExample(){

        ExampleReqDTO req2 = new ExampleReqDTO(2L,"flower",1500);
        ExampleReqDTO req3 = new ExampleReqDTO(3L,"cow",1500);
        ExampleReqDTO req4 = new ExampleReqDTO(4L,"dog",1500);
        ExampleReqDTO req5 = new ExampleReqDTO(5L,"cat",1500);
        es.merge(req2);
        es.merge(req3);
        es.merge(req4);
        es.merge(req5);

        return es.merge(req5);
    }

    @GetMapping("/selectAll")
    public List<ExampleResDTO> selectAll(){

        return es.selectAll();
    }

    @GetMapping("/selectOne")
    public ExampleResDTO selectOne(){

        return es.selectOne(new ExampleReqDTO(3L,"cow",1500));
    }

    @GetMapping("/deleteOne")
    public void deleteOne(){
        es.deleteOne(new ExampleReqDTO(3L,"dog",1500));
    }

    @GetMapping("/deleteAll")
    public void deleteAll(){
        es.deleteAll();
    }

    @GetMapping("/selectByName")
    public List<ExampleResDTO> selectByName(){
        ExampleReqDTO req = new ExampleReqDTO(8L,"dog",2500);
        return  es.selectByName(req);
    }

    @GetMapping("/selectByNameStartWith")
    public List<ExampleResDTO> selectByNameStartWith(){
        ExampleReqDTO req = new ExampleReqDTO(8L,"cat",2500);
        return  es.selectByNameStartWith(req);
    }

    @GetMapping("/selectByPrice")
    public List<ExampleResDTO> selectByPrice(){
        ExampleReqDTO req = new ExampleReqDTO(8L,"cat",2500);
        return  es.selectByPrice(req);
    }

    @GetMapping("/selectByNameAndPrice")
    public List<ExampleResDTO> selectByNameAndPrice(){
        ExampleReqDTO req = new ExampleReqDTO(8L,"dog",2500);
        return  es.selectByNameAndPrice(req);
    }
}
