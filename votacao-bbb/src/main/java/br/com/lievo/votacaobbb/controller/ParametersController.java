package br.com.lievo.votacaobbb.controller;

import java.util.Optional;

import br.com.lievo.votacaobbb.model.ParametersModel;
import br.com.lievo.votacaobbb.repository.ParametersRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/parameters")
@AllArgsConstructor
public class ParametersController {

    private final ParametersRepository repository;

    @PostMapping("/save")
    public ResponseEntity<ParametersModel> save(@RequestBody ParametersModel parameter){
        
        ParametersModel entity = repository.save(parameter);
        
        return ResponseEntity.ok(entity);
    }

    @GetMapping("/query")
    public ResponseEntity<ParametersModel> query(@RequestParam String id){
        
        Optional<ParametersModel> optParameter = repository.findById(id);

        if(optParameter.isEmpty())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(optParameter.get());
    }
}
