package com.example.coursesmanagerkata.dto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "PARTICIPANT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ParticipantDto {

    @Id
    @Column(name = "participant_id")
    private Long participant_id;

    @Column(name = "number")
    private Long number;

    @Column(name = "name")
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="racing_id")
    @JsonIgnore
    private RacingDto racing;



}
