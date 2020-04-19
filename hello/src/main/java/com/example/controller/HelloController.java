package com.example.controller;

import com.example.model.dto.GenericResponse;
import com.example.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hola")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/{name}")
    public ResponseEntity<GenericResponse<String>> saludar(@PathVariable("name") String name){
        return helloService.saludar(name);
    }

    @GetMapping("/generico")
    public ResponseEntity<GenericResponse<String>> saludarGenerico(){
        return helloService.saludarGenerico();
    }

}
