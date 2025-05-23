package com.example.latanadelnerd.Repository;

import com.example.latanadelnerd.Entity.Prodotto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProdottoRepository extends JpaRepository<Prodotto, Integer> {
    List<Prodotto> findAll();
    List<Prodotto> findByNomeIgnoreCaseStartingWith(String nome);

}
