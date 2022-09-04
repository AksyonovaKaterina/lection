package com.example.patterns.structural.composite.without_pattern;

public class Project {

    private JavaDeveloper javaDeveloper;
    private JavaDeveloper javaDeveloper1;
    private KotlinDeveloper kotlinDeveloper;
    private KotlinDeveloper kotlinDeveloper1;

    public static void main(String[] args) {
        Project project = new Project();

        project.javaDeveloper = new JavaDeveloper();
        project.javaDeveloper1 = new JavaDeveloper();
        project.kotlinDeveloper = new KotlinDeveloper();
        project.kotlinDeveloper1 = new KotlinDeveloper();

        project.javaDeveloper.work();
        project.javaDeveloper1.work();
        project.kotlinDeveloper.work();
        project.kotlinDeveloper1.work();
    }

}
