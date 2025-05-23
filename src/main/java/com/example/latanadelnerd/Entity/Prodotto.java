package com.example.latanadelnerd.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Prodotto {
    @Id
    @GeneratedValue
    private Integer codice;
    private String nome;
    private Double prezzo;
    private int quantita;
    private String immagine;

}


