
package com.portfolio.sabrinasantoro.Controller;

import com.portfolio.sabrinasantoro.Model.Proyectos;
import com.portfolio.sabrinasantoro.service.IProyectosService;
import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin (origins = {"https://portfoliosantoro.web.app", "http://localhost:4200"})
public class ProyectosController {
  
@Autowired 
        IProyectosService IProyectosService ;

@GetMapping ("/proyectos/traer")
public List <Proyectos> getProyectos () {
    return IProyectosService.getProyectos() ;
}

@PostMapping("/proyectos/crear")
public String createProyectos (@RequestBody Proyectos proyectos){
    IProyectosService.saveProyectos (proyectos);
    return "El proyecto fue creado correctamente";
    }

 @DeleteMapping ("/proyectos/borrar/{idPro}")
 public void deleteProyecto (@PathVariable Long idPro){
 IProyectosService.deleteProyecto(idPro);
 } 
   
 @PutMapping ("/proyectos/editar/{idPro}")
 public Proyectos editProyectos (@PathVariable Long idPro,
         @RequestParam ("ProyectosName") String nuevoProyectosName,
         @RequestParam ("DescribeProyect")String nuevoDescribeProyect,
         @RequestParam ("FechaProyecto")Date nuevaFechaProyecto
          ){
         
   Proyectos proyectos =   IProyectosService.findProyectos (idPro);
 proyectos.setProyectosName (nuevoProyectosName);
 proyectos.setDescribeProyect (nuevoDescribeProyect);
 proyectos.setFechaProyecto (nuevaFechaProyecto);
 
 IProyectosService.saveProyectos (proyectos);
 return proyectos;
}}
    
    

    
  
