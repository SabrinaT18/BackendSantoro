
package com.portfolio.sabrinasantoro.service;

import com.portfolio.sabrinasantoro.Repo.IEduRepo;
import com.portfolio.sabrinasantoro.Model.Educacion;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class ImpEduService implements IeducacionService {
    public IEduRepo IEduRepo;

    @Override
    public List<Educacion> getEducacion() {
    List<Educacion> educacion = IEduRepo.findAll();
    return educacion;
    }
    

    @Override
    public Educacion addEducacion(Educacion educacion) {
    return IEduRepo.save (educacion);
    }

    @Override
    public void deleteEducacion(Long idEd) {
    IEduRepo.deleteById(idEd);
         
    }

    @Override
    public Educacion findEducacion(Long idEd) {
     return IEduRepo.findById(idEd).orElse(null);
    }

    @Override
    public void saveEducacion(Educacion educacion) {
    IEduRepo.save (educacion);
    }
     
}


   
    
  
    

 
    

