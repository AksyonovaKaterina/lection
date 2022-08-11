package com.example.patterns.creational.factory_method.without_pattern;

import com.example.patterns.creational.factory_method.without_pattern.developers.JavaDeveloper;
import com.example.patterns.creational.factory_method.without_pattern.developers.KotlinDeveloper;

public class App {

    public static void main(String[] args) {
        JavaDeveloper developer = new JavaDeveloper(); // need to change when work other developer
        developer.writeJavaCode();
        KotlinDeveloper developer2 = new KotlinDeveloper();
        developer2.writeKotlinCode();
        KotlinDeveloper developer3 = new KotlinDeveloper();
        developer3.writeKotlinCode();
        KotlinDeveloper developer4 = new KotlinDeveloper();
        developer4.writeKotlinCode();
    }
}
