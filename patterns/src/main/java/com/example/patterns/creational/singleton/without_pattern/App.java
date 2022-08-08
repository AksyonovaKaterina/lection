package com.example.patterns.creational.singleton.without_pattern;

import java.util.stream.IntStream;

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
            IntStream.range(1, 5).forEach(e -> cycleOfWork());
        }

        private void cycleOfWork() {
            developer.logWork();
            qa.logWork();
        }
    }
}
