package com.tallerjava.tallerjavataller1.domain.dto;

import io.swagger.annotations.ApiModelProperty;

public class Office {
    @ApiModelProperty(notes = "Identificador de Cada Oficina de Atención al Ciudadano")
    private Integer oficinaId;
    @ApiModelProperty(notes = "Nombre de la Oficina")
    private String nombreId;
    @ApiModelProperty(notes = "Gestor encargado de la Oficina")
    private String gestorId;
    @ApiModelProperty(notes = "Email del gestor de la Oficina")
    private String emailId;
    @ApiModelProperty(notes = "Dirección de la Oficina")
    private String direccionId;
    @ApiModelProperty(notes = "Ciudad donde se encuentra la Oficina")
    private String ciudadId;
    @ApiModelProperty(notes = "Departamento donde se encuentra la Oficina")
    private String departamentoId;

    public Integer getOficinaId() {
        return oficinaId;
    }

    public void setOficinaId(Integer oficinaId) {
        this.oficinaId = oficinaId;
    }

    public String getNombreId() {
        return nombreId;
    }

    public void setNombreId(String nombreId) {
        this.nombreId = nombreId;
    }

    public String getGestorId() {
        return gestorId;
    }

    public void setGestorId(String gestorId) {
        this.gestorId = gestorId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getDireccionId() {
        return direccionId;
    }

    public void setDireccionId(String direccionId) {
        this.direccionId = direccionId;
    }

    public String getCiudadId() {
        return ciudadId;
    }

    public void setCiudadId(String ciudadId) {
        this.ciudadId = ciudadId;
    }

    public String getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(String departamentoId) {
        this.departamentoId = departamentoId;
    }
}
