package com.demo.Interfaces;

import com.demo.models.Annonce;

import java.util.List;
import java.util.Optional;

public interface AnnonceInterface {


    //get
    public List<Annonce> getAllAnnonces();
    public Optional<Annonce> getAnnonceById(Long id);

    public  List<Annonce> getAnnoncesByUser(Long idUser);


    //add
    public Annonce addAnnonce(Annonce annonce);

    void addAnnonceToUser(Long idUser, Long idAnnonce);

    //delete
    public String deleteAnnonce(Long id);

    //update
    public  Annonce updateAnnonce(Annonce annonce);

}
