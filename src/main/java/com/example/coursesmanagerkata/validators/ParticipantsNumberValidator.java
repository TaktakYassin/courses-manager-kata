package com.example.coursesmanagerkata.validators;

import com.example.coursesmanagerkata.model.Participant;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.List;

public class ParticipantsNumberValidator implements ConstraintValidator<ParticipantsNumberConstraint, List<Participant>> {

    @Override
    public void initialize(ParticipantsNumberConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(List<Participant> participants, ConstraintValidatorContext constraintValidatorContext) {
        return participants!=null && participants.size()>=3;
    }


}
