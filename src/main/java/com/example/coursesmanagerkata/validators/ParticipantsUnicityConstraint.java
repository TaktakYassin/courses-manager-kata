package com.example.coursesmanagerkata.validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ParticipantsUnicityValidator.class)
@Target( { ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ParticipantsUnicityConstraint {
    String message() default "Participants contains duplicates or one participant number is missing";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
