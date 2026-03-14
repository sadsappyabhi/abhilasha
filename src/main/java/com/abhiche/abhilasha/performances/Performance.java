package com.abhiche.abhilasha.performances;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name="performance")
@Table(name="performances")
public class Performance {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;

    @Column(name="date", nullable = false)
    LocalDate date;

    @Column(name="project", nullable = false)
    String project;

    @Column(name="venue", nullable = false)
    String venue;

    @Column(name="notes")
    String notes;
}