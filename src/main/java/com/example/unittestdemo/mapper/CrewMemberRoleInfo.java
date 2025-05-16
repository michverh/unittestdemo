package com.example.unittestdemo.mapper;

import lombok.Builder;

@Builder
public record CrewMemberRoleInfo(
    String staffNumber,
    String rank,
    String crewType,
    Long seniority
) {}
