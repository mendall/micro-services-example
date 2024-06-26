package com.example.school.domain;

import lombok.Builder;

@Builder
public record StudentTO(String firstName, String lastName, String email) {
}