package com.example.unittestdemo.order;

import java.util.List;

import lombok.Builder;

@Builder
public record Order(
    String status,
    List<String> seats
) {}
