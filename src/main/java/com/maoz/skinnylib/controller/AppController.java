package com.maoz.skinnylib.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class AppController {

    @GetMapping("/info")
    public ResponseEntity<Map<String, Object>> test(HttpServletRequest request){
        Map<String, Object> result = new HashMap<>();
        result.put("caller", request.getRemoteAddr());
        result.put("port", request.getLocalPort());
        return ResponseEntity.ok(result);
    }
}
