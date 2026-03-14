package com.abhiche.abhilasha.performances;

import java.util.List;

public interface PerformanceService {
    List<PerformanceDTO> findAll();
    List<PerformanceDTO> findAllInFuture();
    List<PerformanceDTO> findAllInPast();
}