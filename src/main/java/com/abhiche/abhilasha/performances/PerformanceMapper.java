package com.abhiche.abhilasha.performances;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PerformanceMapper {
    PerformanceDTO performanceToPerformanceDTO(Performance performance);
}