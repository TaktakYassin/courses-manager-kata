package com.example.coursesmanagerkata.dao;

import com.example.coursesmanagerkata.dto.RacingDto;
import com.example.coursesmanagerkata.model.Racing;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RacingRepository extends CrudRepository<RacingDto,Long> {

    @Query(value = "SELECT nextval('RACING_SEQ') FROM dual", nativeQuery = true)
    public Long getNextValMySequence();

}
