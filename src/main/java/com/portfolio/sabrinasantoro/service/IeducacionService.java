
package com.portfolio.sabrinasantoro.service;

import com.portfolio.sabrinasantoro.Model.Educacion;
import java.util.List;
import org.springframework.stereotype.Service;

@Service 
public interface IeducacionService {
    public List <Educacion> getEducacion ();
     
    public Educacion addEducacion (Educacion educacion); 
      
    public void deleteEducacion (Long idEd);
            
    public Educacion findEducacion (Long idEd);

    public void saveEducacion(Educacion educacion);
    
}
