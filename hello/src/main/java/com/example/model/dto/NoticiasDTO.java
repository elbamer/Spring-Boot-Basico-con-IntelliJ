package com.example.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class NoticiasDTO {
    private String num_comentario;
    private String num_noticia;

    public String getNum_noticia() {
        return num_noticia;
    }

    public void setNum_noticia(String num_noticia) {
        this.num_noticia = num_noticia;
    }

    public String getNum_comentario() {
        return num_comentario;
    }

    public void setNum_comentario(String num_comentario) {
        this.num_comentario = num_comentario;
    }
}