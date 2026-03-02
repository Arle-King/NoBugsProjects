package org.example.clean_code.lesson_3_design_patterns.structural_patterns.adaprer.task_1;

public class PDFProcessor implements DocumentProcessor{
    @Override
    public String process() {
        return "Конвертим в PDF";
    }
}
