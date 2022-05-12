package br.com.lievo.votacaobbb.services;

import java.util.Date;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import br.com.lievo.votacaobbb.model.ParticipantModel;
import br.com.lievo.votacaobbb.model.VotingModel;
import br.com.lievo.votacaobbb.repository.VotingRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class VotingConsumerKafkaService {
    
    private final VotingRepository votingRepository;

    @KafkaListener(topics = "${topic.name}", groupId = "${group.id}")
    public void consume(ConsumerRecord<String, ParticipantModel> payload) {
       
        VotingModel votingModel = new VotingModel(null, payload.value(), new Date());

        votingRepository.insert(votingModel);

    }
}

