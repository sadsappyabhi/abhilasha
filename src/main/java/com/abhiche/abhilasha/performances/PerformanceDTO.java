package com.abhiche.abhilasha.performances;

import java.time.LocalDate;

public record PerformanceDTO(
        Long id,
        LocalDate date,
        String project,
        String venue,
        String notes
) {}