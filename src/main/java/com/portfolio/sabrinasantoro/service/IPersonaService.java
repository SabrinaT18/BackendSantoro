

package com.portfolio.sabrinasantoro.service;

import com.portfolio.sabrinasantoro.Model.Persona;

 
public interface IPersonaService {
      
    public void savePersona (Persona persona);
    
    public void deletePersona (Long id);
            
    public Persona findPersona (Long id);
    
    public Persona getPersona (Long id);
     }



