package com.portfolio.sabrinasantoro.Controller;

import com.portfolio.sabrinasantoro.Model.Experiencia_laboral;
import com.portfolio.sabrinasantoro.service.IexpLaboralService;
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
@RequestMapping("/api/1/experiencia")
@CrossOrigin(origins = {"https://portfoliosantoro.web.app", "http://localhost:4200"})
public class ExpLaboralController {

    @Autowired
    IexpLaboralService IExpLaboralService;

    @GetMapping("/traer")
    public ResponseEntity<List<Experiencia_laboral>> getExperiencia_laboral() {
        List<Experiencia_laboral> list = IExpLaboralService.getExperiencia_laboral();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PostMapping("/crear")
    public String createExperiencia_laboral(@RequestBody Experiencia_laboral experiencia_laboral) {
        IExpLaboralService.saveExperiencia_laboral(experiencia_laboral);
        return "La experiencia laboral fue creada correctamente";
    }

    @DeleteMapping("/borrar/{idExp}")
    public void deleteExperiencia_laboral(@PathVariable Long idExp) {
        IExpLaboralService.deleteExperiencia_laboral(idExp);
    }

    @PutMapping("/editar/{idExp}")
    public Experiencia_laboral editExperiencia_laboral(@PathVariable Long idExp,
            @RequestParam("NombreEmpresa") String nuevoNombreEmpresa,
            @RequestParam("descripción") String nuevadescripción,
            @RequestParam("FechaInicio") Date nuevaFechaInicio,
            @RequestParam("FechaFin") Date nuevaFechaFin,
            @RequestParam("esTrabajoActual") boolean esTrabajoActual,
            @RequestParam("tipo_empleo") String nuevoTipo_empleo
    ) {

        Experiencia_laboral experiencia_laboral = IExpLaboralService.findExperiencia_laboral(idExp);
        experiencia_laboral.setNombreEmpresa(nuevoNombreEmpresa);
        experiencia_laboral.setDescripción(nuevadescripción);
        experiencia_laboral.setFechaInicio(nuevaFechaInicio);
        experiencia_laboral.setFechaFin(nuevaFechaFin);
        experiencia_laboral.setEsTrabajoActual(esTrabajoActual);
        experiencia_laboral.setTipo_empleo(nuevoTipo_empleo);

        IExpLaboralService.saveExperiencia_laboral(experiencia_laboral);
        return experiencia_laboral;
    }
}
