package com.example.coursesmanagerkata.mapper;

import com.example.coursesmanagerkata.dto.ParticipantDto;
import com.example.coursesmanagerkata.model.Participant;

public interface ParticipantMapper {

    ParticipantDto mapParticipantToParticipantDto(Participant participant);

    Participant mapParticipantDtoToParticipant(ParticipantDto participant);


}
