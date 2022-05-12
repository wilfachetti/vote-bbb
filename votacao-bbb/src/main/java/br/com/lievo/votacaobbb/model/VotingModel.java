package br.com.lievo.votacaobbb.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("votings")
public class VotingModel {
    
    @Id
    private String id;
    private ParticipantModel participantModel;
    private Date dateTime;
    
}
