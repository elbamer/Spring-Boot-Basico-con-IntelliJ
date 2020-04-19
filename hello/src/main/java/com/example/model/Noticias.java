package com.example.model;

import javax.persistence.*;
@Entity
@Table(name = "comentario")
public class Noticias {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="identificador")
    private Long id;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


        @Column(name="Noticia")
        private String num_noticia;
        public String getNum_noticia() {
            return num_noticia;
        }
        public void setNum_noticia(String num_noticia) {
            this.num_noticia = num_noticia;
        }

        @Column(name="Comentario")
        private String num_comentario;
        public String getNum_comentario() {
            return num_comentario;
        }
        public void setNum_comentarioÇ(String num_comentario) {
            this.num_comentario = num_comentario;
        }


}
