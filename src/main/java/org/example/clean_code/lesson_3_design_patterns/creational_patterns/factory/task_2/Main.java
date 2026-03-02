package org.example.clean_code.lesson_3_design_patterns.creational_patterns.factory.task_2;

public class Main {
    public static void main(String[] args) {
        WeaponCreated weaponCreated = new WeaponFactory();

        Weapon weapon = weaponCreated.createWeapon("Bow");
        weapon.attack();
    }
}
