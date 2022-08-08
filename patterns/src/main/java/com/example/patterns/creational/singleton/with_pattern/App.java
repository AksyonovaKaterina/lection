package com.example.patterns.creational.singleton.with_pattern;

public class App {
    private Developer developer;
    private QA qa;

    public App() {
        developer = new Developer();
        qa = new QA();
    }

    public static void main(String[] args) {
        App app = new App();
        Sprint sprint = app.new Sprint();
        sprint.work();
    }

    class Sprint {
        public void work() {
            for (int i = 0; i < 5; i++) {
                developer.logWork();
                qa.logWork();
            }
        }
    }
}
