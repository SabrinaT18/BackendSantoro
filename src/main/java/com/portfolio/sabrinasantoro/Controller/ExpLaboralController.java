package com.portfolio.sabrinasantoro.Controller;

import com.portfolio.sabrinasantoro.Model.Experiencia_laboral;
import com.portfolio.sabrinasantoro.service.IexpLaboralService;
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
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/experiencia")
@CrossOrigin(origins = {"https://portfoliosantoro.web.app", "http://localhost:4200"})
public class ExpLaboralController {

    @Autowired
    IexpLaboralService IExpLaboralService;

    @GetMapping("/traer")
    public ResponseEntity <List<Experiencia_laboral>> getExperiencia_laboral() {
        List<Experiencia_laboral> experiencias = IExpLaboralService.getExperiencia_laboral();
        return new ResponseEntity(experiencias, HttpStatus.OK);
    }

    @PostMapping("/crear")
    public String createExperiencia_laboral(@RequestBody Experiencia_laboral experiencia_laboral) {
        IExpLaboralService.addExperiencia_laboral(experiencia_laboral);
        return "La experiencia laboral fue creada correctamente";
    }

    @DeleteMapping("/borrar/{idExp}")
    public void deleteExperiencia_laboral(@PathVariable Long idExp) {
        IExpLaboralService.deleteExperiencia_laboral(idExp);
    }

    @PutMapping("/editar")
     public ResponseEntity<Experiencia_laboral> editarExperiencia_laboral(@RequestBody Experiencia_laboral Experiencia_laboral){
        Experiencia_laboral updateExperiencia_laboral=IExpLaboralService.editarExperiencia_laboral(Experiencia_laboral);
        return new ResponseEntity<>(updateExperiencia_laboral,HttpStatus.OK);
}
}