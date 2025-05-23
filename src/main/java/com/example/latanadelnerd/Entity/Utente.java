package com.example.latanadelnerd.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity


public class Utente {
    @Id
    private long EMAIL;
    private String NOME;
    private String cognome;
    private String telefono;
}
