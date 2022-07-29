
package com.portfolio.sabrinasantoro.service;

import com.portfolio.sabrinasantoro.Repo.IEncabezadoRepo;
import com.portfolio.sabrinasantoro.Model.Encabezado;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ImpEncabezadoService implements IEncabezadoService {

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
    public Encabezado findEncabezado(Long id) {
    return IEncabezadoRepo.findById(id).orElse(null);
   
    }
}
