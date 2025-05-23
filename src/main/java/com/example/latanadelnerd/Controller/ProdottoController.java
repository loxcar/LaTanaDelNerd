package com.example.latanadelnerd.Controller;

import com.example.latanadelnerd.Dto.ProdottoRequest;
import com.example.latanadelnerd.Services.ProdottoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prodotti" )
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class ProdottoController{
    @Autowired
    private final ProdottoService service;

    @PostMapping("/save")
    public ResponseEntity<Integer>saveProdotto(
            @RequestBody ProdottoRequest request
    ){
        System.out.println(request.toString());
        return ResponseEntity.ok(service.save(request));
    }
    @GetMapping("/getProdotti" )
    public ResponseEntity<List<ProdottoRequest>>findAllProdotto(){
        return ResponseEntity.ok(service.findAll());
    }
    @GetMapping("/getProdottiDalNome")
    public ResponseEntity<List<ProdottoRequest>> findAllProdottiDalNome(@RequestParam String nome) {
        return ResponseEntity.ok(service.findByNome(nome));
    }
}
