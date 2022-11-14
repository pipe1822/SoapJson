package com.example.BaseSimit.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Cliente {

    @Id
    private Integer cedula ;

    private String nombre;

    private String Apellido;

    @OneToMany(mappedBy="cliente", fetch= FetchType.EAGER)
    private Set <Comparendo> comparendos= new HashSet<>();

    public Cliente() {
    }

    public Cliente(Integer cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        Apellido = apellido;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public Set<Comparendo> getComparendos() {
        return comparendos;
    }

    public void setComparendos(Set<Comparendo> comparendos) {
        this.comparendos = comparendos;
    }
}
