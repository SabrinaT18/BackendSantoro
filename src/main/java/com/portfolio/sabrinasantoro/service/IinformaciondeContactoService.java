
package com.portfolio.sabrinasantoro.service;

import com.portfolio.sabrinasantoro.Model.InformaciondeContacto;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IinformaciondeContactoService {
    
       
    public List <InformaciondeContacto> getinformaciondeContacto ();
    
    public void saveinformaciondeContacto (InformaciondeContacto infodeContacto);
    
    public void deleteinformaciondeContacto (Long idCont);
            
    public InformaciondeContacto findinformaciondeContacto (Long idCont);

    
}
