
package com.portfolio.sabrinasantoro.Controller;

import com.portfolio.sabrinasantoro.Model.Persona;
import com.portfolio.sabrinasantoro.service.IPersonaService;
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
@RequestMapping("/api/persona")
@CrossOrigin (origins = "*")
public class PersonaController {

@Autowired 
private IPersonaService IPersoService ;
 
@GetMapping ("/traer")
public List <Persona> getPersona(){
 return IPersoService.getPersona();
}
    
@PostMapping("/crear")
public String savePersona (@RequestBody Persona persona){
    IPersoService.savePersona (persona);
    return "La persona fue creada correctamente";
    }

 @DeleteMapping ("/borrar/{id}")
 public void deletePersona (@PathVariable Long id){
 IPersoService.deletePersona(id);
 } 
   
 @PutMapping ("/editar/{id}")
 public Persona editPersona (@PathVariable Long id,
         @RequestParam ("nombre") String nuevoNombre,
         @RequestParam ("Apellido")String nuevoApellido,
         @RequestParam ("Img")String nuevaImg,
         @RequestParam ("company")String nuevaCompany
            ){
         
 Persona persona =   IPersoService.findPersona (id);
 persona.setNombre (nuevoNombre);
 persona.setApellido (nuevoApellido);
 persona.setImg (nuevaImg);
 persona.setCompany (nuevaCompany);

 
 
 IPersoService.savePersona (persona);
 return persona;
}}

