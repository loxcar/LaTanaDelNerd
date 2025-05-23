package com.example.latanadelnerd.Services;

import com.example.latanadelnerd.Entity.Prodotto;
import com.example.latanadelnerd.Repository.ProdottoRepository;
import com.example.latanadelnerd.Dto.ProdottoRequest;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor

public class ProdottoService {
    @Autowired
    public final ProdottoRepository prodottoRepository;

    public Integer save(ProdottoRequest request){
        Prodotto prodotto = new Prodotto();
        prodotto.setNome(request.getNome());
        prodotto.setPrezzo(request.getPrezzo());
        prodotto.setImmagine(request.getImmagine());
        prodotto.setQuantita(request.getQuantita());
        return prodottoRepository.save(prodotto).getCodice();
    }
    public List<ProdottoRequest> findAll(){
        List<Prodotto> prodotti = prodottoRepository.findAll();
        List<ProdottoRequest> prodottoRequests = new ArrayList<>();
        for (Prodotto prodotto : prodotti) {
            ProdottoRequest pq=new ProdottoRequest(
            );
            pq.setCodice(prodotto.getCodice());
            pq.setImmagine(prodotto.getImmagine());
            pq.setPrezzo(prodotto.getPrezzo());
            pq.setNome(prodotto.getNome());
            pq.setQuantita(prodotto.getQuantita());
            prodottoRequests.add(pq);
        }
        return prodottoRequests;
    }

    public List<ProdottoRequest> findByNome(String n){
        List<Prodotto> prodotti = prodottoRepository.findByNomeIgnoreCaseStartingWith(n);
        List<ProdottoRequest> prodottoRequests = new ArrayList<>();
        for (Prodotto prodotto : prodotti) {
            ProdottoRequest pq=new ProdottoRequest(
            );
            pq.setCodice(prodotto.getCodice());
            pq.setImmagine(prodotto.getImmagine());
            pq.setPrezzo(prodotto.getPrezzo());
            pq.setNome(prodotto.getNome());
            pq.setQuantita(prodotto.getQuantita());
            prodottoRequests.add(pq);
        }
        return prodottoRequests;
    }
}
