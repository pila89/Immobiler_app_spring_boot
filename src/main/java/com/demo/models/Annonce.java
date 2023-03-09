package com.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Optional;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Annonce implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) //avoir les differents valeurs de Identity
    private Long id;

    private String description;
    private Integer prix;

    @ManyToOne()
    @JsonIgnore
    @ToString.Exclude
    private User user;

}
