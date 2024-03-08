package com.example.coursesmanagerkata.validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ParticipantsNumberValidator.class)
@Target( { ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ParticipantsNumberConstraint {
    String message() default "The participants numbers is less than 3";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
