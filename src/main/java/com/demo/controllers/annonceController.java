package com.demo.controllers;


import com.demo.Interfaces.AnnonceInterface;
import com.demo.models.Annonce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/annonces")
public class annonceController {
    @Autowired
    public AnnonceInterface annonceServiceInterface;

    @GetMapping("/all")
    public List<Annonce> getAllAnnonces(){
        return  annonceServiceInterface.getAllAnnonces();
    }

    @PutMapping("/addAnnonceToUser/{idUser}/{idAnnonce}")
    public void addAnnonceToUser (@PathVariable("idUser") Long idUser,
                                  @PathVariable("idAnnonce") Long idAnnonce) {
        annonceServiceInterface.addAnnonceToUser(idUser,idAnnonce);
    }
    @PostMapping("")
    public Annonce addAnnonce(@RequestBody Annonce annonce){
        return  annonceServiceInterface.addAnnonce(annonce);
    }

    @GetMapping("/{id}")
    public Optional<Annonce> getAnnonceById(@PathVariable Long id){
        return  annonceServiceInterface.getAnnonceById(id);
    }
    @GetMapping("/user/{id}")
    public List<Annonce > getAnnoncesByUser(@PathVariable Long id){
        return  annonceServiceInterface.getAnnoncesByUser(id);
    }
    @DeleteMapping ("/{id}")
    public String deleteAnnonceById(@PathVariable Long id){
        return annonceServiceInterface.deleteAnnonce(id);
    }

    @PutMapping("/update")
    public Annonce updateAnnonce (@RequestBody Annonce annonce){
        return annonceServiceInterface.updateAnnonce(annonce);
    }

}
