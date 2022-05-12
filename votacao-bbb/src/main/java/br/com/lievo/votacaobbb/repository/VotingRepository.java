package br.com.lievo.votacaobbb.repository;

import br.com.lievo.votacaobbb.model.VotingModel;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface VotingRepository extends MongoRepository<VotingModel, String> {
    
}
