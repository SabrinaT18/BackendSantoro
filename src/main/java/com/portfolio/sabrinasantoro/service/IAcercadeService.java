
package com.portfolio.sabrinasantoro.service;

import com.portfolio.sabrinasantoro.Model.Acercade;
import java.util.List;
import org.springframework.stereotype.Service;



  @Service
public interface IAcercadeService {
   
    public List <Acercade> getAcercade ();
    
    public Acercade saveAcercade (Acercade Acercade);
    
    public void deleteAcercade (Long idA);
            
   public List<Acercade> findAcercade();
    
}
