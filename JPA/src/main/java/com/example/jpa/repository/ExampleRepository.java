package com.example.jpa.repository;

import com.example.jpa.entity.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExampleRepository extends JpaRepository<Example, Long> {

    public List<Example> findByName(String name);
    public List<Example> findByNameStartingWith(String name);
    public List<Example> findByPriceLessThan(int price);
    public List<Example> findByNameAndPrice(String name, int price);

}
