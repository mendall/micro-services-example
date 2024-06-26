package com.example.school.domain;

import lombok.*;

import java.util.List;

@Builder
public record SchoolInfo(String name, String email, List<StudentTO> students) {}
