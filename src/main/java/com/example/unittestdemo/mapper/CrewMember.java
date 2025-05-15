package com.example.unittestdemo.mapper;

import java.util.Optional;

import lombok.Builder;

@Builder
public record CrewMember(
    String firstName,
    String lastName,
    String staffNumber,
    String passportNumber,
    String nationality,
    String rank,
    String crewType,
    Optional<Long> seniority
) {}
