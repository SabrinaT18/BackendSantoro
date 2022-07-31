
package com.portfolio.sabrinasantoro.Controller;

import com.portfolio.sabrinasantoro.Model.Encabezado;
import com.portfolio.sabrinasantoro.service.IEncabezadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/api/1/encabezado")
@CrossOrigin (origins = {"https://portfoliosantoro.web.app", "http://localhost:4200"})
public class EncabezadoController {
    
@Autowired 
IEncabezadoService IEncabezadoService ;

@GetMapping ("/traer")
public List <Encabezado> getEncabezado () {
    return IEncabezadoService.getEncabezado();
}
    
@PostMapping("/crear")
public String createEncabezado (@RequestBody Encabezado encabezado){
    IEncabezadoService.saveEncabezado (encabezado);
    return "El banner fue creado correctamente";
    }

 @DeleteMapping ("/borrar/{id}")
 public void deletePersona (@PathVariable Long idH){
 IEncabezadoService.deleteEncabezado(idH);
 } 
   
 @PutMapping ("/editar/{id}")
 public Encabezado editEncabezado (@PathVariable Long idH,
         @RequestParam ("backImage") String nuevabackImage,
         @RequestParam ("Linkedin")String nuevoLinkedin,
         @RequestParam ("Facebook")String nuevoFacebook ,
         @RequestParam ("Instagram")String nuevoInstagram
         ){
         
   Encabezado encabezado =   IEncabezadoService.findEncabezado (idH);
 encabezado.setBackImage (nuevabackImage);
 encabezado.setLinkedin (nuevoLinkedin);
 encabezado.setFacebook (nuevoFacebook);
 encabezado.setInstagram (nuevoInstagram);
 
 IEncabezadoService.saveEncabezado (encabezado);
 return encabezado;
}
    
}

