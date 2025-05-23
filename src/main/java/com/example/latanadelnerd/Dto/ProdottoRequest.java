package com.example.latanadelnerd.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProdottoRequest {
    Integer codice;
    String nome;
    Double prezzo;
    int quantita;
    String immagine;
}
