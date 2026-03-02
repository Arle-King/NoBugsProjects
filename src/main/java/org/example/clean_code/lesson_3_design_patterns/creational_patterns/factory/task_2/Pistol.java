package org.example.clean_code.lesson_3_design_patterns.creational_patterns.factory.task_2;

public class Pistol implements Weapon{
    @Override
    public void attack() {
        System.out.println("Пистолет стреляет");
    }
}
