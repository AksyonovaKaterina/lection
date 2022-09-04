package com.example.patterns.structural.decorator.with_pattern;

public class Work {

    public static void main(String[] args) {
        Developer javaDeveloper = new JavaDeveloper();

        Developer senior = new SeniorJavaDeveloperDecorator(javaDeveloper);
        Developer junior = new JuniorJavaDeveloperDecorator(javaDeveloper);

        senior.work();
        junior.work();
    }

}
