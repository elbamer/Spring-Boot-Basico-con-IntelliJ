package com.example.controller;

import com.example.model.dto.GenericResponse;
import com.example.model.dto.UsuarioDTO;
import com.example.repository.UsuariosRepository;
import com.example.model.Usuarios;
import com.example.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/noticia")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;


    @GetMapping("/list")
    public ResponseEntity<GenericResponse<List<UsuarioDTO>>> getNoticias(){

        return usuarioService.getNoticias();

    }
}

// reposity -> accede a la bbdd
// model -> represantion de la bbdd en un clase
// dto -> devuelves al usuario.


