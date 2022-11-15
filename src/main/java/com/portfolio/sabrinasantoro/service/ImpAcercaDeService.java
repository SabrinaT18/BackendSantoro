
package com.portfolio.sabrinasantoro.service;

import com.portfolio.sabrinasantoro.Model.Acercade;
import com.portfolio.sabrinasantoro.Repo.IAcercadeRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpAcercaDeService implements IAcercadeService{
 
 @Autowired    
 public IAcercadeRepo IAcercadeRepo;

    
 @Override
    public List<Acercade> getAcercade() {
         List<Acercade> Acercade = IAcercadeRepo.findAll();
    return Acercade;
    }

     @Override
    public Acercade saveAcercade(Acercade Acercade) {
    return  IAcercadeRepo.save(Acercade);
    }


    @Override
    public void deleteAcercade(Long id) {
         IAcercadeRepo.deleteById(id);
        
    }

    @Override
    public List<Acercade> findAcercade() {
     return IAcercadeRepo.findAll();
    }
}
    

