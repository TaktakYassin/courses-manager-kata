package com.example.coursesmanagerkata.mapper;

import com.example.coursesmanagerkata.dto.ParticipantDto;
import com.example.coursesmanagerkata.dto.RacingDto;
import com.example.coursesmanagerkata.model.Participant;
import com.example.coursesmanagerkata.model.Racing;

import java.util.ArrayList;
import java.util.List;

public class RacingMapperImpl implements RacingMapper {

    @Override
    public RacingDto mapRacingToRacingDto(Racing source) {
        RacingDto racingDto = new RacingDto();
        racingDto.setNumber(source.getNumber());
        racingDto.setDate(source.getDate());
        racingDto.setName(source.getName());
        List<ParticipantDto> participantDtos = new ArrayList<>();
        for(Participant participant:source.getParticipants()){
            participantDtos.add(new ParticipantDto(System.currentTimeMillis()+participant.getNumber(),participant.getNumber(),participant.getName(),racingDto));
        }
        racingDto.setParticipants(participantDtos);
        return racingDto;
    }

    @Override
    public Racing mapRacingDtoToRacing(RacingDto source) {
        return null;
    }
}
