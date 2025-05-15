package com.example.unittestdemo.mapper;

import java.time.LocalDate;

import lombok.Builder;

@Builder
public record CrewMemberPassportInfo(
    String staffNumber,
    String firstName,
    String lastName,
    String passportNumber,
    String nationality,
    LocalDate dateOfBirth,
    LocalDate passportExpiryDate,
    String issuingCountry
) {}
