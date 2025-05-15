package com.example.unittestdemo.order;

import java.util.List;

import lombok.Builder;

@Builder
public record CreateOrderCommand(
   List<String> seats
) {}
