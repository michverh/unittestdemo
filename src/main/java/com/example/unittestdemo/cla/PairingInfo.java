package com.example.unittestdemo.cla;

import java.time.ZonedDateTime;

import lombok.Builder;

@Builder
public record PairingInfo(
    ZonedDateTime currentActivityEnd,
    ZonedDateTime nextActivityStart,
    String departureStation,
    String arrivalStation
) {}
