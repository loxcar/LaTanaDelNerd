package com.example.latanadelnerd.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Carrello {
    @Id
    @GeneratedValue
    private int id;
    @OneToMany
    private List<Prodotto> carrello=new ArrayList<>();
    @OneToOne
    private Utente utente;
}
