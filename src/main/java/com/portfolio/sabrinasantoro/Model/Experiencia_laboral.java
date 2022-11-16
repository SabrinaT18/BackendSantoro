
package com.portfolio.sabrinasantoro.Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "experiencia_laboral")
public class Experiencia_laboral {

  @Id  
  @GeneratedValue (strategy = GenerationType.IDENTITY)
   private Long idExp;
   
   private String NombreEmpresa;
    
   private String descripcion;
    
   private Date FechaInicio;
    
   private Date FechaFin;
   
   private boolean esTrabajoActual;
 
   private String tipo_empleo;

    public Experiencia_laboral() {
    }

    public Experiencia_laboral(Long idExp, String NombreEmpresa, String descripcion, Date FechaInicio, Date FechaFin, boolean esTrabajoActual, String tipo_empleo) {
        this.idExp = idExp;
        this.NombreEmpresa = NombreEmpresa;
        this.descripcion = descripcion;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.esTrabajoActual = esTrabajoActual;
        this.tipo_empleo = tipo_empleo;
    }

    public Long getidExp() {
        return idExp;
    }

    public void setidExp(Long idExp) {
        this.idExp = idExp;
    }

    public String getNombreEmpresa() {
        return NombreEmpresa;
    }

    public void setNombreEmpresa(String NombreEmpresa) {
        this.NombreEmpresa = NombreEmpresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripción = descripcion;
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

    public boolean isEsTrabajoActual() {
        return esTrabajoActual;
    }

    public void setEsTrabajoActual(boolean esTrabajoActual) {
        this.esTrabajoActual = esTrabajoActual;
    }

    public String getTipo_empleo() {
        return tipo_empleo;
    }

    public void setTipo_empleo(String tipo_empleo) {
        this.tipo_empleo = tipo_empleo;
    }
   
   
   
}
