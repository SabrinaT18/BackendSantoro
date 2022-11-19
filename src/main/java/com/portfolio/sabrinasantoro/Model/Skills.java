
package com.portfolio.sabrinasantoro.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "skills")
public class Skills {
  
    @Id  
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idS;
   
    private String SkillsName;
    
    private int SkillsPorcentaje;

    public Skills() {
    }

    public Skills(Long idS, String SkillsName, Number SkillsPorcentaje) {
        this.idS = idS;
        this.SkillsName = SkillsName;
        this.SkillsPorcentaje = (int) SkillsPorcentaje;
    }

    public Long getIdS() {
        return idS;
    }

    public void setIdS(Long idS) {
        this.idS = idS;
    }

    public String getSkillsName() {
        return SkillsName;
    }

    public void setSkillsName(String SkillsName) {
        this.SkillsName = SkillsName;
    }

    public Number getSkillsPorcentaje() {
        return SkillsPorcentaje;
    }

    public void setSkillsPorcentaje(int  SkillsPorcentaje) {
        this.SkillsPorcentaje = SkillsPorcentaje;
    }
    
}
