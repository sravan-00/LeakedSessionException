package com.example.demo.controller;

import com.example.demo.entity.Singer;
import com.example.demo.repository.DemoRepo;
import com.google.cloud.spanner.Key;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class DemoController {
    @Autowired
    DemoRepo demoRepo;

    @GetMapping(path = "/singer/{id}")
    public Singer getSingerName(@PathVariable(name = "id") String id) {

      Optional <Singer> singer =  demoRepo.findById(Key.of(id));
     return  singer.isPresent()?singer.get():null;
    }

}
