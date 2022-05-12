package br.com.lievo.votacaobbb.services;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import br.com.lievo.votacaobbb.model.ParticipantModel;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class VotingProducerKafkaService {

    private static final String VOTING_TOPIC = "voting";
    private final KafkaTemplate<String, ParticipantModel> template;

    public void addEvent(ParticipantModel participantModel) {
        template.send(VOTING_TOPIC, participantModel);
    }
}
