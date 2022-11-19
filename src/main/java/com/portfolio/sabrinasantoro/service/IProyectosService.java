
package com.portfolio.sabrinasantoro.service;

import com.portfolio.sabrinasantoro.Model.Proyectos;
import java.util.List;
import org.springframework.stereotype.Service;

@Service 
public interface IProyectosService {
   public List <Proyectos> getProyectos ();
    
   public void saveProyectos (Proyectos proyectos);
    
   public void deleteProyecto (Long idPro);
            
   public Proyectos editProyecto (Proyectos proyectos);
  
   public Proyectos addProyectos(Proyectos proyectos);

    
}
