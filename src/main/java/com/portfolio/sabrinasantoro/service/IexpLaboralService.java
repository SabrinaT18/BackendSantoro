
package com.portfolio.sabrinasantoro.service;

import com.portfolio.sabrinasantoro.Model.Experiencia_laboral;
import java.util.List;
import org.springframework.stereotype.Service;

@Service 
public interface IexpLaboralService {
    public List <Experiencia_laboral> getExperiencia_laboral ();
    
    public void saveExperiencia_laboral (Experiencia_laboral experiencia_laboral);
    
    public void deleteExperiencia_laboral (Long idExp);
            
    public Experiencia_laboral findExperiencia_laboral (Long idExp);

        
}
