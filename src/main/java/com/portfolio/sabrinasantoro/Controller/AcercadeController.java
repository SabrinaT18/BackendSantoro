package com.portfolio.sabrinasantoro.Controller;

import com.portfolio.sabrinasantoro.Model.Acercade;
import com.portfolio.sabrinasantoro.service.IAcercadeService;
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
@RequestMapping("/api/Acercade")
@CrossOrigin(origins= "*")
public class AcercadeController {

    @Autowired
    IAcercadeService IAcercadeService;

    @GetMapping("/traer")
    public ResponseEntity <List<Acercade>> getAcercade(){
        List<Acercade> acercaDe = IAcercadeService.findAcercade();
        return new ResponseEntity<>(acercaDe, HttpStatus.OK);
    }

    @PostMapping("/crear")
    public String createAcercade(@RequestBody Acercade Acercade) {
        IAcercadeService.saveAcercade(Acercade);
        return "Creado correctamente";
    }

    @DeleteMapping("/borrar/{id}")
    public void deleteAcercade(@PathVariable Long idA) {
        IAcercadeService.deleteAcercade(idA);
    }

    @PutMapping("/editar/{id}")
    public Acercade editAcercade(@PathVariable Long idA,
            @RequestParam("acercade") String nuevoAcercade
    ) {

        Acercade Acercade = IAcercadeService.findAcercade(idA);

        Acercade.setAcercade(nuevoAcercade);

        IAcercadeService.saveAcercade(Acercade);
        return Acercade;
    }
}
