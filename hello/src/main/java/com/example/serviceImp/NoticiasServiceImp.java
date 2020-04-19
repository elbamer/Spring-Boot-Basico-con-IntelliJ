package com.example.serviceImp;

import com.example.model.Noticias;

import com.example.model.dto.GenericResponse;
import com.example.model.dto.NoticiasDTO;

import com.example.repository.NoticiasRepository;

import com.example.service.NoriciasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class NoticiasServiceImp implements NoriciasService {
    @Autowired
    NoticiasRepository noticiasRepository;

    @Override
    public ResponseEntity<GenericResponse<List<NoticiasDTO>>> getNoticia1() {

        Iterable<Noticias> noticias = noticiasRepository.findAll();
        List<NoticiasDTO> notList = new ArrayList<NoticiasDTO>();
        noticias.forEach(n -> {
            NoticiasDTO currentnot = new NoticiasDTO();
            currentnot.setNum_comentario(n.getNum_noticia());
            currentnot.setNum_noticia(n.getNum_comentario());
            notList.add(currentnot);
        });

        GenericResponse<List<NoticiasDTO>> response = new GenericResponse<List<NoticiasDTO>>();
        response.data = notList;

        return new ResponseEntity<GenericResponse<List<NoticiasDTO>>>(response, HttpStatus.OK);

        //return new ResponseEntity<List<UsuarioDTO>>( userList, HttpStatus.OK);
    }


}