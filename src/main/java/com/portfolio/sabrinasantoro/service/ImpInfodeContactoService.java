
package com.portfolio.sabrinasantoro.service;

import com.portfolio.sabrinasantoro.Model.InformaciondeContacto;
import com.portfolio.sabrinasantoro.Repo.IInfodeContactoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpInfodeContactoService implements IinformaciondeContactoService {
    
    @Autowired    
    public IInfodeContactoRepo IInfodeContactoRepo;
        
    @Override
    public List<InformaciondeContacto> getinformaciondeContacto() {
        List<InformaciondeContacto> informaciondeContacto = IInfodeContactoRepo.findAll();
    return informaciondeContacto; 
    }

    @Override
    public void saveinformaciondeContacto(InformaciondeContacto infodeContacto) {
    IInfodeContactoRepo.save(infodeContacto);
   }
    

    @Override
    public void deleteinformaciondeContacto(Long id) {
    IInfodeContactoRepo.deleteById(id);
    }

    @Override
    public InformaciondeContacto findinformaciondeContacto(Long id) {
    return IInfodeContactoRepo.findById(id).orElse(null);
   
    }
    
    
}
