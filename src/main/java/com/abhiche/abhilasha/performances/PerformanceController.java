package com.abhiche.abhilasha.performances;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/performances")
public class PerformanceController {
    PerformanceService performanceService;

    @Autowired
    public PerformanceController(PerformanceService performanceService) {
        this.performanceService = performanceService;
    }

    @GetMapping
    public ResponseEntity<List<List<PerformanceDTO>>> findAll() {
        List<List<PerformanceDTO>> performances = performanceService.findAll();
        return ResponseEntity.ok(performances);
    }
}