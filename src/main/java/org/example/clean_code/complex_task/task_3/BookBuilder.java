package org.example.clean_code.complex_task.task_3;

public class BookBuilder {

    Book book;

    private BookBuilder() {};

    public static CreateBookBuilder createBookBuilder() {
        return new BookBuilder().new CreateBookBuilder();
    }

    public class CreateBookBuilder {
        private CreateBookBuilder() {
            book = new Book();
        }

        public CreateBookBuilder setTitle(String title) {
            book.setTitle(title);
            return this;
        }

        public CreateBookBuilder setAuthor(String author) {
            book.setAuthor(author);
            return this;
        }

        public CreateBookBuilder setDescription(String description) {
            book.setDescription(description);
            return this;
        }

        public Book getBook() {
            return book;
        }
    }
}
