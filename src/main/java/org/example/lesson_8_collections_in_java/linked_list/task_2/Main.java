package org.example.lesson_8_collections_in_java.linked_list.task_2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Помыть посуду");
        list.add("Помыть окна");
        list.add("Помыть пол");

        while (!list.isEmpty()) {
            System.out.println(list.poll() + " Сделано!");
        }
    }
}
