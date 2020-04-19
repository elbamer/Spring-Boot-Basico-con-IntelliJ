package com.example.service;

import com.example.model.dto.GenericResponse;
import com.example.model.dto.UsuarioDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UsuarioService {
    public ResponseEntity<GenericResponse<List<UsuarioDTO>>> getNoticias();
}
