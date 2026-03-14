package com.abhiche.abhilasha.performances;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PerformanceServiceImpl implements PerformanceService {

    private final PerformanceRepository performanceRepository;
    private final PerformanceMapper performanceMapper;

    public PerformanceServiceImpl(PerformanceRepository performanceRepository, PerformanceMapper performanceMapper) {
        this.performanceRepository = performanceRepository;
        this.performanceMapper = performanceMapper;
    }

    public List<List<PerformanceDTO>> findAll() {
        List<Performance> performances = performanceRepository.findAll();
        List<PerformanceDTO> futurePerformances = new  ArrayList<>();
        List<PerformanceDTO> pastPerformances = new ArrayList<>();

        for (Performance performance : performances) {
            LocalDate today = LocalDate.now();
            if (performance.getDate().isBefore(today)) {
                pastPerformances.add(performanceMapper.performanceToPerformanceDTO(performance));
            } else {
                futurePerformances.add(performanceMapper.performanceToPerformanceDTO(performance));
            }
        }

        List<List<PerformanceDTO>> performanceDTOs = new ArrayList<>();
        performanceDTOs.add(futurePerformances);
        performanceDTOs.add(pastPerformances);
        return performanceDTOs;
    }
}