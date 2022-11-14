package com.example.BaseSimit.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Comparendo {
    @Id
    private Integer NoComparendo;

    private String infraccion;

    private String fecha;

    private String tcomparendo= "PONAL";

    private String dpto;

    private String municipio;

    private Integer valor;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="cliente_cc")
    private Cliente cliente;

    public Comparendo() {
    }

    public Comparendo(Integer noComparendo, String infraccion, String fecha, String tcomparendo, String dpto, String municipio, Integer valor, Cliente cliente) {
        NoComparendo = noComparendo;
        this.infraccion = infraccion;
        this.fecha = fecha;
        this.tcomparendo = tcomparendo;
        this.dpto = dpto;
        this.municipio = municipio;
        this.valor = valor;
        this.cliente = cliente;
    }

    public Integer getNoComparendo() {
        return NoComparendo;
    }

    public void setNoComparendo(Integer noComparendo) {
        NoComparendo = noComparendo;
    }

    public String getInfraccion() {
        return infraccion;
    }

    public void setInfraccion(String infraccion) {
        this.infraccion = infraccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getTcomparendo() {
        return tcomparendo;
    }

    public void setTcomparendo(String tcomparendo) {
        this.tcomparendo = tcomparendo;
    }

    @JsonIgnore
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}