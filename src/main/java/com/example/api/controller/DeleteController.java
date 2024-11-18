package com.example.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/delete")
public class DeleteController {
    //http://localhost:8080/api/v1/delete/{userid}
    //http://localhost:8080/api/v1/delete/123?account=user01
    
    @DeleteMapping("/{userId}")
    public void delete(@PathVariable String userId, @RequestParam String account) {

        System.out.println(userId);
        System.out.println(account);
    }

    @DeleteMapping("/{id}/{name}/{number}/{email}")
    public void delete(@PathVariable String id, @PathVariable String name, @PathVariable String number, @PathVariable String email){
        System.out.println(id);
        System.out.println(name);
        System.out.println(number);
        System.out.println(email);
    }
}
