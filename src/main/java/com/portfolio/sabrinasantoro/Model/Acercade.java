package com.portfolio.sabrinasantoro.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "acercade")
public class Acercade  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idA;

    @NotNull
    @Size(min = 1, max = 250)
    private String texto;

    public Acercade() {
    }

    public Acercade(Long idA, String acercade) {
        this.idA = idA;
        this.texto = acercade;
    }

    public Long getIdA() {
        return idA;
    }

    public void setIdA(Long idA) {
        this.idA = idA;
    }

    public String getAcercade() {
        return texto;
    }

    public void setAcercade(String acercade) {
        this.texto = acercade;
    }

}
