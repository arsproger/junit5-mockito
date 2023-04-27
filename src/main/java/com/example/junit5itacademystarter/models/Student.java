package com.example.junit5itacademystarter.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Student {
    private Long id;
    private String name;
    private String surname;
    private Integer age;
    private String department;
}
