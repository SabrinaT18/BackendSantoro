package com.portfolio.sabrinasantoro.Controller;

import com.portfolio.sabrinasantoro.Model.Skills;
import com.portfolio.sabrinasantoro.service.ISkills_Service;
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
@RequestMapping("/api/1/Skills")
@CrossOrigin(origins = {"https://portfoliosantoro.web.app", "http://localhost:4200"})
public class SkillsController {

    @Autowired
    ISkills_Service ISkills_Service;

    @GetMapping("/traer")
    public ResponseEntity<List<Skills>> getSkills() {
        List<Skills> list = ISkills_Service.getSkills();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @PostMapping("/crear")
    public String createSkills(@RequestBody Skills Skills) {
        ISkills_Service.saveSkills(Skills);
        return "La habilidad fue creada correctamente";
    }

    @DeleteMapping("/borrar/{idS}")
    public void deleteSkills(@PathVariable Long idS) {
        ISkills_Service.deleteSkills(idS);
    }

    @PutMapping("/editar/{id}")
    public Skills editSkills(@PathVariable Long idS,
            @RequestParam("SkillsName") String nuevoSkillsName,
            @RequestParam("SkillsPorcentaje") Number nuevoSkillsPorcentaje
    ) {

        Skills Skills = ISkills_Service.findSkills(idS);
        Skills.setSkillsName(nuevoSkillsName);
        Skills.setSkillsPorcentaje(nuevoSkillsPorcentaje);

        ISkills_Service.saveSkills(Skills);
        return Skills;
    }
}
