package com.example.coursesmanagerkata.mapper;

import com.example.coursesmanagerkata.dto.RacingDto;
import com.example.coursesmanagerkata.model.Racing;
import org.mapstruct.factory.Mappers;

public interface RacingMapper {

    RacingMapper MAPPER = Mappers.getMapper(RacingMapper.class);

    RacingDto mapRacingToRacingDto(Racing source);

    Racing mapRacingDtoToRacing(RacingDto source);

}
