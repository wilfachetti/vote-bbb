package br.com.lievo.votacaobbb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.lievo.votacaobbb.model.ParticipantModel;

public interface ParticipantRepository extends MongoRepository<ParticipantModel, String> {
    
}
