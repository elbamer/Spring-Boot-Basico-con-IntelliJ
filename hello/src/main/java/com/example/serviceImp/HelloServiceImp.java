package com.example.serviceImp;

import com.example.model.dto.GenericResponse;
import com.example.service.HelloService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImp implements HelloService {
    @Override
    public ResponseEntity<GenericResponse<String>> saludar(String name) {
        GenericResponse saludo = new GenericResponse<String>();
        saludo.code = 0;
        saludo.data = "hola " + name;
        return new ResponseEntity<GenericResponse<String>>( saludo, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<GenericResponse<String>> saludarGenerico() {
        GenericResponse saludo = new GenericResponse<String>();
        saludo.code = 0;
        saludo.data = "hola a todos";
        return new ResponseEntity<GenericResponse<String>>( saludo, HttpStatus.OK);
    }
}

