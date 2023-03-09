package com.demo.repository;

import com.demo.models.Annonce;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnonceRepository extends JpaRepository <Annonce, Long>{
}
