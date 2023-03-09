package com.demo.servicesimp;

import com.demo.Interfaces.AnnonceInterface;
import com.demo.models.Annonce;
import com.demo.models.User;
import com.demo.repository.AnnonceRepository;
import com.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AnnonceServiceImp implements AnnonceInterface {

    private AnnonceRepository annonceRepository;
    private UserRepository userRepository;
    @Override
    public List<Annonce> getAllAnnonces() {
        return annonceRepository.findAll();
    }


    @Override
    public Annonce addAnnonce(Annonce annonce) {
        return annonceRepository.save(annonce);
    }


    @Override
    public void addAnnonceToUser(Long idUser,Long idAnnonce) {
        User user = userRepository.findById(idUser).orElse(null);
        Annonce annonce = annonceRepository.findById(idAnnonce).orElse(null);
        annonce.setUser(user);
        annonceRepository.save(annonce);

        /*Optional<User> user = Optional.ofNullable(userRepository.findById(id).orElse(null));
        annonce.setUser(user);
        annonce.setUser(user);
        user.get().getAnnonces().add(annonce);
       userRepository.save(user);
        return annonceRepository.save(annonce);*/
    }

    @Override
    public String deleteAnnonce(Long id) {
        annonceRepository.deleteById(id);
        return "succeful delete";
    }

    @Override
    public Optional<Annonce> getAnnonceById(Long id) {
        return annonceRepository.findById(id);
    }

    @Override
    public List<Annonce> getAnnoncesByUser(Long id) {

        return null;
    }

    @Override
    public Annonce updateAnnonce(Annonce annonce) {
        return null;
    }


}
