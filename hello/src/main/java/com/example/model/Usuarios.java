package com.example.model;


import javax.persistence.*;
// Para la base de datos all
@Entity
@Table(name = "usuarios")
public class Usuarios {

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

    @Column(name="nombre")
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name="alias")
    private String alias;
    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Column(name="contrasena")
    private String password;
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name="activo")
    private Boolean active;
    public Boolean getActive() {
        return active;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }

    public String toString(){
        return id+" | " + name+ " | "+ alias;
    }

}
