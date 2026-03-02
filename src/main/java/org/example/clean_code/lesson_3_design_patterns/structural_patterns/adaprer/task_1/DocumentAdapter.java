package org.example.clean_code.lesson_3_design_patterns.structural_patterns.adaprer.task_1;

public class DocumentAdapter {
    private DocumentProcessor documentProcessor;

    public String convertToPDF(String file) {
        documentProcessor = new PDFProcessor();
        return documentProcessor.process();
    }

    public String convertToDoc(String file) {
        documentProcessor = new DOCProcessor();
        return documentProcessor.process();
    }
}
