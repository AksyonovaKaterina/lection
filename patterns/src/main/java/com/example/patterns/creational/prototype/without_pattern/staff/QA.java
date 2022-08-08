package com.example.patterns.creational.prototype.without_pattern.staff;

import com.example.patterns.creational.prototype.utils.Grade;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QA {
    private String userName;
    private Grade grade;
    private List<String> projects;
}
