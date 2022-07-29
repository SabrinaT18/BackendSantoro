package com.portfolio.sabrinasantoro.Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proyectos")
public class Proyectos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPro;

    private String ProyectosName;

    private String DescribeProyect;

    private Date FechaProyecto;

    public Proyectos() {
    }

    public Proyectos(Long idPro, String ProyectosName, String DescribeProyect, Date FechaProyecto) {
        this.idPro = idPro;
        this.ProyectosName = ProyectosName;
        this.DescribeProyect = DescribeProyect;
        this.FechaProyecto = FechaProyecto;
    }

    public Long getidPro() {
        return idPro;
    }

    public void setidPro(Long idPro) {
        this.idPro = idPro;
    }

    public String getProyectosName() {
        return ProyectosName;
    }

    public void setProyectosName(String ProyectosName) {
        this.ProyectosName = ProyectosName;
    }

    public String getDescribeProyect() {
        return DescribeProyect;
    }

    public void setDescribeProyect(String DescribeProyect) {
        this.DescribeProyect = DescribeProyect;
    }

    public Date getFechaProyecto() {
        return FechaProyecto;
    }

    public void setFechaProyecto(Date FechaProyecto) {
        this.FechaProyecto = FechaProyecto;
    }

}
