package org.example.clean_code.lesson_3_design_patterns.creational_patterns.factory.task_2;

public class WeaponFactory extends WeaponCreated{

    @Override
    Weapon createWeapon(String type) {
        return switch (type) {
            case "Sword" -> new Sword();
            case "Bow" -> new Bow();
            case "Pistol" -> new Pistol();
            default -> throw new IllegalArgumentException("Unknown weapon");
        };
    }
}
