package com.example.student.domain;

import lombok.Builder;

@Builder
public record StudentTO(String firstName, String lastName, String email, Long schoolId) {
}