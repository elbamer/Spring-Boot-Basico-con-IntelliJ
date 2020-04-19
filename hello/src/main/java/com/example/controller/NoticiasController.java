package com.example.controller;

import com.example.model.dto.GenericResponse;
import com.example.model.dto.NoticiasDTO;
import com.example.model.dto.UsuarioDTO;
import com.example.service.NoriciasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/noticia1")
public class NoticiasController {

        @Autowired
        NoriciasService noriciasService;
        @GetMapping("/list")
        public ResponseEntity<GenericResponse<List<NoticiasDTO>>> getNoticia1(){

                return noriciasService.getNoticia1();

        }
    }

// reposity -> accede a la bbdd
// model -> represantion de la bbdd en un clase
// dto -> devuelves al usuario.



