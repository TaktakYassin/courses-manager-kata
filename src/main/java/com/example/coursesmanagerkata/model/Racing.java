package com.example.coursesmanagerkata.model;

import com.example.coursesmanagerkata.validators.ParticipantsNumberConstraint;
import com.example.coursesmanagerkata.validators.ParticipantsUnicityConstraint;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Racing {

    @JsonProperty("date")
    @NotBlank(message = "The date is required.")
    private String date;
    @JsonProperty("numero")
    @NotNull(message = "The number is required.")
    private Long number;
    @JsonProperty("nom")
    @NotBlank(message = "The name is required.")
    private String name;
    @JsonProperty("partants")
    @Valid
    @ParticipantsNumberConstraint
    @ParticipantsUnicityConstraint
    private List<Participant> participants;

}
