
package com.portfolio.sabrinasantoro.Controller;

import com.portfolio.sabrinasantoro.Model.Educacion;
import com.portfolio.sabrinasantoro.service.IeducacionService;
import java.sql.Date;
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
@RequestMapping("/api/educacion")
@CrossOrigin(origins = "*")
public class eduController {
    @Autowired 
    IeducacionService IeducacionService;
    
@GetMapping ("/traer")
public ResponseEntity <List<Educacion>> getEducacion () {
   List <Educacion> list = IeducacionService.getEducacion();
    return new ResponseEntity (list, HttpStatus.OK);
}
    
 @PostMapping("/crear")
public String addEducacion (@RequestBody Educacion educacion){
    IeducacionService.addEducacion(educacion);
    return "La educación fue creada correctamente";
    }

 @DeleteMapping ("/borrar/{idEd}")
 public void deleteEducacion (@PathVariable Long idEd){
 IeducacionService.deleteEducacion(idEd);
 
 } 
 
 @PutMapping ("/editar/{idEd}")
 public Educacion editarEducacion (@PathVariable Long idEd,
         @RequestParam ("SchoolName") String newSchoolName,
         @RequestParam ("Título")String nuevoTítulo,
         @RequestParam ("FechaInicio")Date nuevaFechaInicio,
         @RequestParam ("FechaFin")Date nuevaFechaFin,
         @RequestParam ("Promedio")String nuevoPromedio,
         @RequestParam ("tipo_estudio")String nuevoTipo_estudio
         ){
         
 Educacion educacion =   IeducacionService.findEducacion (idEd);
 educacion.setSchoolName (newSchoolName);
 educacion.setTitulo (nuevoTítulo);
 educacion.setFechaInicio (nuevaFechaInicio);
 educacion.setFechaFin (nuevaFechaFin);
 educacion.setPromedio (nuevoPromedio);
 educacion.setTipo_estudio (nuevoTipo_estudio);

 
 
 IeducacionService.saveEducacion(educacion);
 return educacion;
}} 
    
    
    

