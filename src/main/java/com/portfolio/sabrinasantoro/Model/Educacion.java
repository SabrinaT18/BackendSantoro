package com.portfolio.sabrinasantoro.Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "educacion")
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEd;

    private String SchoolName;

    private String Título;

    private Date FechaInicio;

    private Date FechaFin;

    private String Promedio;

    private String Tipo_estudio;

    public Educacion() {
    }

    public Educacion(Long idEd, String SchoolName, String Título, Date FechaInicio, Date FechaFin, String Promedio, String Tipo_estudio) {
        this.idEd = idEd;
        this.SchoolName = SchoolName;
        this.Título = Título;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.Promedio = Promedio;
        this.Tipo_estudio = Tipo_estudio;
    }

    public Long getidEd() {
        return idEd;
    }

    public void setidEd(Long idEd) {
        this.idEd = idEd;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String SchoolName) {
        this.SchoolName = SchoolName;
    }

    public String getTítulo() {
        return Título;
    }

    public void setTítulo(String Título) {
        this.Título = Título;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }

    public String getPromedio() {
        return Promedio;
    }

    public void setPromedio(String Promedio) {
        this.Promedio = Promedio;
    }

    public String getTipo_estudio() {
        return Tipo_estudio;
    }

    public void setTipo_estudio(String Tipo_estudio) {
        this.Tipo_estudio = Tipo_estudio;
    }

}
