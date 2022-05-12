package br.com.lievo.votacaobbb.controller;

import br.com.lievo.votacaobbb.model.ParticipantModel;
import br.com.lievo.votacaobbb.services.VotingProducerKafkaService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/voting")
@AllArgsConstructor
public class VotingController {
    
    private final VotingProducerKafkaService service;
    
    @PostMapping
    public ResponseEntity<String> vote(@RequestBody ParticipantModel participantModel) {
    
        service.addEvent(participantModel);     

        return ResponseEntity.ok("Voto computado.");
    }
}
