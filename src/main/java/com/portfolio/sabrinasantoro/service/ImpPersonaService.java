
package com.portfolio.sabrinasantoro.service;

import com.portfolio.sabrinasantoro.Model.Persona;
import com.portfolio.sabrinasantoro.Repo.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService {
 
@Autowired    
IPersonaRepository IPersoRepo;
   
    
   @Override
   public List<Persona> getPersona() {
   return IPersoRepo.findAll(); 
    }
            
    @Override
    public void savePersona(Persona persona) {
    IPersoRepo.save(persona);
   }
    

    @Override
    public void deletePersona(Long id) {
    IPersoRepo.deleteById(id);
    }

    @Override
    public Persona editPersona(Persona persona) {
    return IPersoRepo.save(persona);
    }
}

    
   
