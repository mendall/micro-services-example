package com.example.school.domain;

import lombok.Builder;

@Builder
public record SchoolTO(String name, String email) {
}
