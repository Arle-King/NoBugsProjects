package org.example.lesson_8_collections_in_java.hash_set.task_4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<String> set = new HashSet<>(Arrays.asList("Ростислав", "Берти", "Наоки"));
        String name;

        System.out.println("Введите имя");
        name = scan.nextLine();

        if (set.contains(name)) {
            System.out.println("Имя содержится в множестве");
        } else {
            System.out.println("Такого имени ещё нет");
        }

    }
}
