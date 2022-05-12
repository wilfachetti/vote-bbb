package br.com.lievo.votacaobbb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.lievo.votacaobbb.model.ParametersModel;

public interface ParametersRepository extends MongoRepository<ParametersModel, String> {
    
}