package com.example.api.controller;

import com.example.api.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class PostController {
    @PostMapping("/post")
    public String post(@RequestBody Map<String, Object> requestData){
        StringBuilder sb = new StringBuilder();

        requestData.forEach((key,value) -> {
            sb.append("key : ").append(key).append("\n");
            sb.append("value : ").append(value).append("\n");
        });
        return sb.toString();
    }
    @PostMapping("/post/info")
    public PostRequestDto post1(@RequestBody PostRequestDto postRequestDto){
        //객체를 직접 반환하여 JSON 형식으로 직렬화되도록 설정
        return postRequestDto;
    }

}
