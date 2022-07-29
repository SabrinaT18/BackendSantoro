package com.portfolio.sabrinasantoro.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "persona")
public class Persona  {

    @Id
    @Column(name = "Persona_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String nombre;

    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String apellido;

    private String Img;
    private String company;

//relaciones 1 a muchos//
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experiencia_laboral> experiencia = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEd")
    private List<Educacion> educacion = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idS")
    private List<Skills> skills = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idPro")
    private List<Proyectos> proyectos = new ArrayList<>();

//relaciones 1 a 1//
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "idH")
    private Encabezado encabezado;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "IdA")
    private Acercade acercade;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String Img, String company, Encabezado encabezado, Acercade acercade) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Img = Img;
        this.company = company;
        this.encabezado = encabezado;
        this.acercade = acercade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String Img) {
        this.Img = Img;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<Experiencia_laboral> getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(List<Experiencia_laboral> experiencia) {
        this.experiencia = experiencia;
    }

    public List<Educacion> getEducacion() {
        return educacion;
    }

    public void setEducacion(List<Educacion> educacion) {
        this.educacion = educacion;
    }

    public List<Skills> getSkills() {
        return skills;
    }

    public void setSkills(List<Skills> skills) {
        this.skills = skills;
    }

    public List<Proyectos> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<Proyectos> proyectos) {
        this.proyectos = proyectos;
    }

    public Encabezado getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(Encabezado encabezado) {
        this.encabezado = encabezado;
    }

    public Acercade getAcercade() {
        return acercade;
    }

    public void setAcercade(Acercade acercade) {
        this.acercade = acercade;
    }

}
