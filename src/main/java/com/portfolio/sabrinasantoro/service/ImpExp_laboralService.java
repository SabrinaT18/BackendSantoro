
package com.portfolio.sabrinasantoro.service;

import com.portfolio.sabrinasantoro.Repo.Iexp_labRepo;
import com.portfolio.sabrinasantoro.Model.Experiencia_laboral;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ImpExp_laboralService implements IexpLaboralService {
    
    public Iexp_labRepo Iexp_labRepo;

    @Override
    public List<Experiencia_laboral> getExperiencia_laboral() {
     List<Experiencia_laboral> experiencia_laboral = Iexp_labRepo.findAll();
    return experiencia_laboral;   
            }

    @Override
    public void saveExperiencia_laboral(Experiencia_laboral experiencia_laboral) {
    Iexp_labRepo.save(experiencia_laboral);
    
    }

    @Override
    public void deleteExperiencia_laboral(Long id) {
    Iexp_labRepo.deleteById(id);
    }

    @Override
    public Experiencia_laboral findExperiencia_laboral(Long id) {
     return Iexp_labRepo.findById(id).orElse(null);    
    }
        
    
    
    
}
