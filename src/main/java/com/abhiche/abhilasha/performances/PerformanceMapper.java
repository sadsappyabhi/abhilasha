package com.abhiche.abhilasha.performances;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PerformanceMapper {
    PerformanceDTO performanceToPerformanceDTO(Performance performance);
}