package com.example.patterns.creational.prototype.without_pattern.staff;

import com.example.patterns.creational.prototype.utils.Grade;
import com.example.patterns.creational.prototype.utils.ProgrammingLanguage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// won't work if fields will be final
// won't work if we have no getters or setters
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Developer {
    private ProgrammingLanguage language;
    private Grade grade;
    private String userName;
}
