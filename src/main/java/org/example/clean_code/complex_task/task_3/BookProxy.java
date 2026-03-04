package org.example.clean_code.complex_task.task_3;

public class BookProxy implements Showable{

    private Book book;
    private String content;

    public BookProxy(Book book) {
        this.book = book;
    }

    @Override
    public String getContent() {
        if (this.content == null) {
            content = "Author: " + book.getAuthor() + ", Title: " + book.getTitle() + ", Description: " + book.getDescription();
        }
        return content;
    }
}
