package com.abhiche.abhilasha.performances;

import java.util.Date;

public record PerformanceDTO(
        Long id,
        Date date,
        String project,
        String venue,
        String notes
) {}