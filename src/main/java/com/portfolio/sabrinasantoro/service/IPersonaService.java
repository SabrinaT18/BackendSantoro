

package com.portfolio.sabrinasantoro.service;

import com.portfolio.sabrinasantoro.Model.Persona;
import java.util.List;
 
public interface IPersonaService {
      
    public void savePersona (Persona persona);
    
    public void deletePersona (Long id);
            
    public Persona findPersona (Long id);
    
    public List <Persona> getPersona ();
     }



