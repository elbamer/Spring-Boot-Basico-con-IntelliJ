package com.example.service;

import com.example.model.dto.GenericResponse;
import org.springframework.http.ResponseEntity;

public interface HelloService {
    public ResponseEntity<GenericResponse<String>>saludar(String name);

    ResponseEntity<GenericResponse<String>> saludarGenerico();
}
