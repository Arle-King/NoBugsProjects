package org.example.clean_code.lesson_3_design_patterns.structural_patterns.adaprer.task_1;

public class Main {
    public static void main(String[] args) {
        String file = "Doc";
        DocumentAdapter documentAdapter = new DocumentAdapter();

        System.out.println(documentAdapter.convertToPDF(file));
        System.out.println(documentAdapter.convertToDoc(file));
    }
}
