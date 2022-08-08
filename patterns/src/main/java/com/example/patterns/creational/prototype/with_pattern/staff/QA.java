package com.example.patterns.creational.prototype.with_pattern.staff;

import com.example.patterns.creational.prototype.utils.Grade;
import java.util.List;
import lombok.Data;

@Data
public class QA implements Staff {

    private final String userName;
    private final Grade grade;
    private final List<String> projects;

    @Override
    public QA clone() {
        return new QA(this.userName, this.grade, this.projects);
    }
}
