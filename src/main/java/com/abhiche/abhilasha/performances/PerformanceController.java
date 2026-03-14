package com.abhiche.abhilasha.performances;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
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
    public ResponseEntity<List<PerformanceDTO>> findAll() {
        List<PerformanceDTO> performances = performanceService.findAll();
        return ResponseEntity.ok(performances);
    }

    @GetMapping("/future")
    public ResponseEntity<List<PerformanceDTO>> findAllInFuture() {
        List<PerformanceDTO> performances = performanceService.findAllInFuture();
        return ResponseEntity.ok(performances);
    }

    @GetMapping("/past")
    public ResponseEntity<List<PerformanceDTO>> findAllInPast() {
        List<PerformanceDTO> performances = performanceService.findAllInPast();
        return ResponseEntity.ok(performances);
    }

}