package com.example.coursesmanagerkata.service;

import com.example.coursesmanagerkata.dao.RacingRepository;
import com.example.coursesmanagerkata.dto.RacingDto;
import com.example.coursesmanagerkata.mapper.RacingMapper;
import com.example.coursesmanagerkata.model.Racing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RacingServiceImpl implements RacingService {

    private final RacingRepository racingRepository;

    @Autowired
    public RacingServiceImpl(RacingRepository racingRepository) {
        this.racingRepository = racingRepository;
    }

    @Override
    public Racing createRacing(Racing racing) {
        RacingDto racingDto = RacingMapper.MAPPER.mapRacingToRacingDto(racing);
        racingDto.setRacing_id(racingRepository.getNextValMySequence());
        RacingDto result = racingRepository.save(racingDto);
        return RacingMapper.MAPPER.mapRacingDtoToRacing(result);
    }
}
