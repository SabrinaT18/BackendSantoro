package com.portfolio.sabrinasantoro.Controller;

import com.portfolio.sabrinasantoro.Model.Proyectos;
import com.portfolio.sabrinasantoro.service.IProyectosService;
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
@RequestMapping("/api/proyectos")
@CrossOrigin(origins = "*")
public class ProyectosController {

    @Autowired
    IProyectosService IProyectosService;

    @GetMapping("/traer")
    public ResponseEntity<List<Proyectos>> getProyectos() {
        List<Proyectos> list = IProyectosService.getProyectos();
        return new ResponseEntity(list, HttpStatus.OK);
    }

        @PostMapping("/crear")
        public String createProyectos (@RequestBody
        Proyectos proyectos
        
            ){
    IProyectosService.saveProyectos(proyectos);
            return "El proyecto fue creado correctamente";
        }

        @DeleteMapping("/borrar/{idPro}")
        public void deleteProyecto (@PathVariable
        Long idPro
        
            ){
 IProyectosService.deleteProyecto(idPro);
        }

  @PutMapping("/editar")
    public ResponseEntity<Proyectos> editProyecto(@RequestBody Proyectos proyectos) {
        Proyectos updateProyectos = IProyectosService.editProyecto(proyectos);
        return new ResponseEntity<>(updateProyectos, HttpStatus.OK);
    }
    
    }
