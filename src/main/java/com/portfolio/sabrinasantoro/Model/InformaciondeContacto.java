
package com.portfolio.sabrinasantoro.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table (name= "informacionde_contacto")
public class InformaciondeContacto {
   
    @Id  
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idCont;
   
    @NotNull
    private String Email;
    
    @NotNull
    private String Telefono;
    
    private String DNI;
    
    private String Domicilio;

    public InformaciondeContacto() {
    }

    public InformaciondeContacto(Long idCont, String Email, String Telefono, String DNI, String Domicilio) {
        this.idCont = idCont;
        this.Email = Email;
        this.Telefono = Telefono;
        this.DNI = DNI;
        this.Domicilio = Domicilio;
    }

    public Long getidCont() {
        return idCont;
    }

    public void setId(Long idCont) {
        this.idCont = idCont;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }
    
    
    
}
