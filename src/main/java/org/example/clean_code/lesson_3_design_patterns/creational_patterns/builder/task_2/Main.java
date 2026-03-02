package org.example.clean_code.lesson_3_design_patterns.creational_patterns.builder.task_2;

public class Main {
    public static void main(String[] args) {
        Character character = new Character.Builder()
                .setArmor(15)
                .setDamage(40)
                .setHealth(100)
                .setMagic(10)
                .build();

        System.out.println(character.getHealth());
        System.out.println(character.getArmor());
        System.out.println(character.getDamage());
        System.out.println(character.getMagic());
    }
}
