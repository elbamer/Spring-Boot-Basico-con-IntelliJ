package com.example.serviceImp;

import com.example.model.Usuarios;
import com.example.model.dto.GenericResponse;
import com.example.model.dto.UsuarioDTO;
import com.example.repository.UsuariosRepository;
import com.example.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceImp implements UsuarioService {

    @Autowired
    UsuariosRepository usuariosRepository;

    @Override
    public ResponseEntity<GenericResponse<List<UsuarioDTO>>> getNoticias() {
        Iterable<Usuarios> usuarios = usuariosRepository.findAll();
        List<UsuarioDTO> userList = new ArrayList<UsuarioDTO>();
        usuarios.forEach(u -> {
            UsuarioDTO currentuser = new UsuarioDTO();
            currentuser.setActive(u.getActive());
            currentuser.setName(u.getName());
            userList.add(currentuser);
        });

        GenericResponse<List<UsuarioDTO>> response = new GenericResponse<List<UsuarioDTO>>();
        response.data = userList;

        return new ResponseEntity<GenericResponse<List<UsuarioDTO>>>( response, HttpStatus.OK);

        //return new ResponseEntity<List<UsuarioDTO>>( userList, HttpStatus.OK);
    }
}
