
package com.portfolio.sabrinasantoro.service;

import com.portfolio.sabrinasantoro.Model.Encabezado;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IEncabezadoService {
    
    public List <Encabezado> getEncabezado ();
    
    public void saveEncabezado (Encabezado Encabezado);
    
    public void deleteEncabezado (Long idH);
            
    public Encabezado editEncabezado(Encabezado Encabezado);

}
