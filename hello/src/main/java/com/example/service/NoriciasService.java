package com.example.service;

import com.example.model.dto.GenericResponse;
import com.example.model.dto.NoticiasDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface NoriciasService {


         public ResponseEntity<GenericResponse<List<NoticiasDTO>>> getNoticia1();

        // donde esta get noti
    }
