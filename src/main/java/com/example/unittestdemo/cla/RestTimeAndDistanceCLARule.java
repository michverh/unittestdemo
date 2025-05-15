package com.example.unittestdemo.cla;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RestTimeAndDistanceCLARule {
    
    private static final int REST_TIME_THRESHOLD_HOURS = 32;
    private static final int DISTANCE_THRESHOLD_KM = 6500;
    
    private final GreatCircleDistancePort greatCircleDistancePort;
    
    public boolean ruleApplies(PairingInfo pairingInfo) {
        //Todo: implement logic
        return true;
    }
    
}
