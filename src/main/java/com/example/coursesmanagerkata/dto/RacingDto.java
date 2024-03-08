package com.example.coursesmanagerkata.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "RACING")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RacingDto {

    @Id
    @Column(name = "racing_id")
    private Long racing_id;

    @Column(name = "date")
    private String date;

    @Column(name = "number")
    private Long number;

    @Column(name = "name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "racing")
    @JsonIgnoreProperties("racing_id")
    private List<ParticipantDto> participants;




}
