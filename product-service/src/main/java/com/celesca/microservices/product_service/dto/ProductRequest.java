package com.celesca.microservices.product_service.dto;

public record ProductRequest(String id, String name, String description, String price) { }