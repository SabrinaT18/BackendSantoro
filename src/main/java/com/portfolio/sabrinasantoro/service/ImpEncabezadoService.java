
package com.portfolio.sabrinasantoro.service;

import com.portfolio.sabrinasantoro.Repo.IEncabezadoRepo;
import com.portfolio.sabrinasantoro.Model.Encabezado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpEncabezadoService implements IEncabezadoService {

    @Autowired    
    public IEncabezadoRepo IEncabezadoRepo;
   
    
    @Override
    public List<Encabezado> getEncabezado() {
        List<Encabezado> Encabezado = IEncabezadoRepo.findAll();
    return Encabezado; 


    }

    @Override
    public void saveEncabezado(Encabezado encabezado) {
    IEncabezadoRepo.save(encabezado);
   }
    

    @Override
    public void deleteEncabezado(Long id) {
    IEncabezadoRepo.deleteById(id);
    }

      @Override
    public Encabezado  editEncabezado(Encabezado encabezado) {
    return IEncabezadoRepo.save(encabezado);
    }
}
