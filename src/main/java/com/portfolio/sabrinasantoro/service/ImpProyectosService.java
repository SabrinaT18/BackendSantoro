
package com.portfolio.sabrinasantoro.service;

import com.portfolio.sabrinasantoro.Repo.IProyectosRepo;
import com.portfolio.sabrinasantoro.Model.Proyectos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpProyectosService implements IProyectosService {
 
    @Autowired
    public IProyectosRepo IProyectosRepo;
   
    
    @Override
    public List<Proyectos> getProyectos() {
        List <Proyectos> proyectos = IProyectosRepo.findAll();
    return proyectos; 


    }

    @Override
    public void saveProyectos(Proyectos proyecto) {
    IProyectosRepo.save(proyecto);
   }
    
    @Override
    public void deleteProyecto(Long id) {
    IProyectosRepo.deleteById(id);
    }

    @Override
    public Proyectos editProyecto(Proyectos proyecto) {
    return IProyectosRepo.save(proyecto);
         }
 
   @Override
   public Proyectos addProyectos(Proyectos proyecto){
   return IProyectosRepo.save(proyecto);
      }
    
}
