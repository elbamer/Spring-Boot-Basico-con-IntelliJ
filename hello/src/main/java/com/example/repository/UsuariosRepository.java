package com.example.repository;

import com.example.model.Usuarios;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends CrudRepository<Usuarios,Long> {
}



