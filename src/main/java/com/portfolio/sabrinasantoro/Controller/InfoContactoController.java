
package com.portfolio.sabrinasantoro.Controller;

import com.portfolio.sabrinasantoro.Model.InformaciondeContacto;
import com.portfolio.sabrinasantoro.service.IinformaciondeContactoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/infodecontacto")
@CrossOrigin (origins = "*")
public class InfoContactoController {
    
  @Autowired 
        IinformaciondeContactoService IinformaciondeContactoService ;

@GetMapping ("/traer")
public List <InformaciondeContacto> getinformaciondeContacto () {
    return IinformaciondeContactoService.getinformaciondeContacto();
}
    
@PostMapping("/crear")
public String createinformaciondeContacto (@RequestBody InformaciondeContacto infodeContacto){
    IinformaciondeContactoService.saveinformaciondeContacto (infodeContacto);
    return "La información de contacto fue creada correctamente";
    }

 @DeleteMapping ("/borrar/{idCont}")
 public void deleteinformaciondeContacto (@PathVariable Long idCont){
 IinformaciondeContactoService.deleteinformaciondeContacto(idCont);
 } 
    
   
@PutMapping("/editar")
public ResponseEntity<InformaciondeContacto> editInformaciondeContacto(@RequestBody InformaciondeContacto infodeContacto) {
        InformaciondeContacto updateInformaciondeContacto = IinformaciondeContactoService.editInformaciondeContacto(infodeContacto);
        return new ResponseEntity<>(updateInformaciondeContacto, HttpStatus.OK);
    }

}  
    
    
    

