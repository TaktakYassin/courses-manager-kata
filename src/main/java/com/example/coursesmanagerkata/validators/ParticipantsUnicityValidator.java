package com.example.coursesmanagerkata.validators;

import com.example.coursesmanagerkata.model.Participant;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class ParticipantsUnicityValidator implements ConstraintValidator<ParticipantsUnicityConstraint, List<Participant>>  {

    @Override
    public void initialize(ParticipantsUnicityConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(List<Participant> participants, ConstraintValidatorContext constraintValidatorContext) {
        return new HashSet<>(participants).size()== participants.size() && checkRacingParticpantNumbers(participants.size(),participants.stream().map(Participant::getNumber).collect(Collectors.toList()));
    }

    private boolean checkRacingParticpantNumbers(int max,List<Long> numbers){
        numbers.addAll(LongStream.rangeClosed(1, max).boxed().toList());
        return new HashSet<>(numbers).size() == max;
    }

}
