package com.example.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/get")
public class GetController {
    //http://localhost:8080/api/v1/get/name
    @GetMapping("/name")
    public String getName(){
        return "지현";
    }

    @GetMapping("/name2")
    public String getName2(){
        return "Jihyun";
    }

    @GetMapping("/member/{email}")
    public String findByEmail(@PathVariable("email") String email){
        return "email: " + email;
    }

    @GetMapping("/{id}/{name}")
    public String findByNameAndId(@PathVariable("id") String id, @PathVariable("name") String name){
        return "ID: " + id + ", name: " + name;
    }

    @GetMapping("{id}/{name}/{number}/{email}")
    public String findByInfo(@PathVariable("id") String id, @PathVariable("name") String name, @PathVariable("number") String number, @PathVariable("email") String email){
        return "ID: " + id + ",\nname: " + name + ",\nnumber: " + number + ",\nemail: " + email;
    }
}

