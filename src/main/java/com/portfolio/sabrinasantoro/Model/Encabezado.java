
package com.portfolio.sabrinasantoro.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "encabezado")
public class Encabezado {
    @Id  
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idH;
   
    private String backImage;
    
    private String Linkedin; 
   
    private String Facebook;
      
    private String Instagram;

    public Encabezado() {
    }

    public Encabezado(Long idH, String backImage, String Linkedin, String Facebook, String Instagram) {
        this.idH = idH;
        this.backImage = backImage;
        this.Linkedin = Linkedin;
        this.Facebook = Facebook;
        this.Instagram = Instagram;
    }

          
   
    public Long getIdH() {
        return idH;
    }

    public void setIdH(Long idH) {
        this.idH = idH;
    }

    public String getBackImage() {
        return backImage;
    }

    public void setBackImage(String backImage) {
        this.backImage = backImage;
    }

    public String getLinkedin() {
        return Linkedin;
    }

    public void setLinkedin(String Linkedin) {
        this.Linkedin = Linkedin;
    }

    public String getFacebook() {
        return Facebook;
    }

    public void setFacebook(String Facebook) {
        this.Facebook = Facebook;
    }

    public String getInstagram() {
        return Instagram;
    }

    public void setInstagram(String Instagram) {
        this.Instagram = Instagram;
    }

       
    
}