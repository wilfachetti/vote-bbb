package br.com.lievo.votacaobbb.controller;

import java.util.Optional;

import br.com.lievo.votacaobbb.model.ParticipantModel;
import br.com.lievo.votacaobbb.repository.ParticipantRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/participant")
@AllArgsConstructor
public class ParticipantController {

    private final ParticipantRepository participantRepository;

    @PostMapping("/save")
    public ResponseEntity<ParticipantModel> save(@RequestBody ParticipantModel participantModel){
        
        ParticipantModel entity = participantRepository.save(participantModel);
        
        return ResponseEntity.ok(entity);
    }

    @GetMapping("/query")
    public ResponseEntity<ParticipantModel> query(@RequestParam String id){
        
        Optional<ParticipantModel> opt = participantRepository.findById(id);

        if(opt.isEmpty())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(opt.get());
    }
}
