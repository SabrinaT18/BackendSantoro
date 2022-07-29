
package com.portfolio.sabrinasantoro.service;

import com.portfolio.sabrinasantoro.Model.Acercade;
import com.portfolio.sabrinasantoro.Repo.IAcercadeRepo;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ImpAcercaDeService implements IAcercadeService{
 
 public IAcercadeRepo IAcercadeRepo;

    
 @Override
    public List<Acercade> getAcercade() {
         List<Acercade> Acercade = IAcercadeRepo.findAll();
    return Acercade;
    }

    @Override
    public void saveAcercade(Acercade Acercade) {
         IAcercadeRepo.save(Acercade);
        
    }

    @Override
    public void deleteAcercade(Long id) {
         IAcercadeRepo.deleteById(id);
        
    }

    @Override
    public Acercade findAcercade(Long id) {
     return IAcercadeRepo.findById(id).orElse(null);
      
     }
}
    

