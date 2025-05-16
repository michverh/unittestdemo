package com.example.unittestdemo.cla;

import org.springframework.stereotype.Component;

@Component
public class GreatCircleDistanceClient implements GreatCircleDistancePort {
    @Override
    public int getDistance(final String departureStation, final String arrivalStation) {
        return 0;
    }
}
