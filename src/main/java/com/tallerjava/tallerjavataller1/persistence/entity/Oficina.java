package com.tallerjava.tallerjavataller1.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_oacarc", schema = "geolocalizacion")
public class Oficina {

    @Id
    @Column(name = "id_oficina")
    private Integer idOficina;

    @Column(name = "nombre_unidad_armda_nacional")
    private String nomOficina;

    @Column(name = "nombre_gestor")
    private String gestOficina;

    @Column(name = "email_gestor")
    private String emailOficina;

    @Column(name = "direccion_unidad")
    private String dirOficina;

    @Column(name = "ciudad")
    private String ciudOficina;

    @Column(name = "departamento")
    private String depOficina;

    public Integer getIdOficina() {
        return idOficina;
    }

    public void setIdOficina(Integer idOficina) {
        this.idOficina = idOficina;
    }

    public String getNomOficina() {
        return nomOficina;
    }

    public void setNomOficina(String nomOficina) {
        this.nomOficina = nomOficina;
    }

    public String getGestOficina() {
        return gestOficina;
    }

    public void setGestOficina(String gestOficina) {
        this.gestOficina = gestOficina;
    }

    public String getEmailOficina() {
        return emailOficina;
    }

    public void setEmailOficina(String emailOficina) {
        this.emailOficina = emailOficina;
    }

    public String getDirOficina() {
        return dirOficina;
    }

    public void setDirOficina(String dirOficina) {
        this.dirOficina = dirOficina;
    }

    public String getCiudOficina() {
        return ciudOficina;
    }

    public void setCiudOficina(String ciudOficina) {
        this.ciudOficina = ciudOficina;
    }

    public String getDepOficina() {
        return depOficina;
    }

    public void setDepOficina(String depOficina) {
        this.depOficina = depOficina;
    }
}
