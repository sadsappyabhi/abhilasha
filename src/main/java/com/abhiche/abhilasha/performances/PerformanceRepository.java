package com.abhiche.abhilasha.performances;

import jakarta.annotation.Nonnull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PerformanceRepository extends JpaRepository<Performance, Long> {
    @Override
    @Nonnull
    List<Performance> findAll();
}