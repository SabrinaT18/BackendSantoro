
package com.portfolio.sabrinasantoro.service;

import com.portfolio.sabrinasantoro.Repo.IEduRepo;
import com.portfolio.sabrinasantoro.Model.Educacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ImpEduService implements IeducacionService {
    
    @Autowired    
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
    public Educacion editarEducacion(Educacion educacion) {
    return IEduRepo.save(educacion);
    }

    @Override
    public void saveEducacion(Educacion educacion) {
    IEduRepo.save (educacion);
    }
     
}


   
    
  
    

 
    

