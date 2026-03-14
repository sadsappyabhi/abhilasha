package com.abhiche.abhilasha.performances;

import org.springframework.stereotype.Service;

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

    public List<PerformanceDTO> findAll() {
        List<Performance> performances = performanceRepository.findAll();
        List<PerformanceDTO> performanceDTOs = new ArrayList<>();
        for (Performance performance : performances) {
            performanceDTOs.add(performanceMapper.performanceToPerformanceDTO(performance));
        }
        return performanceDTOs;
    }

    public List<PerformanceDTO> findAllInFuture() {
        List<Performance> performances = performanceRepository.findAllInFuture();
        List<PerformanceDTO> performanceDTOs = new ArrayList<>();
        for (Performance performance : performances) {
            performanceDTOs.add(performanceMapper.performanceToPerformanceDTO(performance));
        }
        return performanceDTOs;
    }

    public List<PerformanceDTO> findAllInPast() {
        List<Performance> performances = performanceRepository.findAllInPast();
        List<PerformanceDTO> performanceDTOs = new ArrayList<>();
        for (Performance performance : performances) {
            performanceDTOs.add(performanceMapper.performanceToPerformanceDTO(performance));
        }
        return performanceDTOs;
    }
}