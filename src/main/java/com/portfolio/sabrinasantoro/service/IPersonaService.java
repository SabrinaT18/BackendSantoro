

package com.portfolio.sabrinasantoro.service;

import com.portfolio.sabrinasantoro.Model.Persona;
import java.util.List;
 
public interface IPersonaService {
      
    public void savePersona (Persona persona);
    
    public void deletePersona (Long id);
            
    public Persona editPersona (Persona persona);
    
    public List <Persona> getPersona ();
     }



