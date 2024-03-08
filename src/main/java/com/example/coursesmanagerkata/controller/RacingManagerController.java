package com.example.coursesmanagerkata.controller;

import com.example.coursesmanagerkata.model.Racing;
import com.example.coursesmanagerkata.service.KafkaConsumerService;
import com.example.coursesmanagerkata.service.KafkaProducerService;
import com.example.coursesmanagerkata.service.RacingService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("racing-manager")
public class RacingManagerController {

    private final RacingService racingService;
    private final KafkaProducerService kafkaProducerService;
    private final KafkaConsumerService kafkaConsumerService;


    @Autowired
    public RacingManagerController(RacingService racingService, KafkaProducerService kafkaProducerService,KafkaConsumerService kafkaConsumerService) {
        this.racingService = racingService;
        this.kafkaProducerService = kafkaProducerService;
        this.kafkaConsumerService = kafkaConsumerService;
    }

    @PostMapping(value="/create-race")
    public ResponseEntity<Racing> createRace(@RequestBody @Valid Racing racing){
        kafkaProducerService.sendMessage(racing.toString());
        return ResponseEntity.ok(racingService.createRacing(racing));
    }

    @PostMapping(value="/recuperate-race")
    public ResponseEntity<Racing> createCurrentAccount(@RequestBody @Valid Racing racing) {
        kafkaConsumerService.receiveMessage(racing.toString());
        return ResponseEntity.ok(racingService.createRacing(racing));
    }


}
