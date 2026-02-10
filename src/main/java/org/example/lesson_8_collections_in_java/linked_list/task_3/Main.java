package org.example.lesson_8_collections_in_java.linked_list.task_3;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Помыть посуду");
        list.add("Помыть окна");
        list.add("Помыть пол");

        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
    }
}
