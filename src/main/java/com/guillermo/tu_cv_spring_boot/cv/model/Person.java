package com.guillermo.tu_cv_spring_boot.cv.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String fistName;
    private String lastName;
    private String profession;
}
