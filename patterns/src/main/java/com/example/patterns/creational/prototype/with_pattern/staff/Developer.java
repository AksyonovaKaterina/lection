package com.example.patterns.creational.prototype.with_pattern.staff;

import com.example.patterns.creational.prototype.utils.Grade;
import com.example.patterns.creational.prototype.utils.ProgrammingLanguage;
import lombok.Data;

@Data
public class Developer implements Staff {
    private final ProgrammingLanguage language;
    private final Grade grade;
    private final String userName;

    @Override
    public Developer clone() {
        return new Developer(this.language, this.grade, this.userName);
    }
}
