package org.example.clean_code.complex_task.task_3;

public class Main {
    public static void main(String[] args) {
        Book book = BookBuilder.createBookBuilder()
                .setAuthor("Author")
                .setTitle("Title")
                .setDescription("Description")
                .getBook();

        BookProxy proxy = new BookProxy(book);

        String content = proxy.getContent();
        System.out.println("Content of the book: " + content);
    }
}
