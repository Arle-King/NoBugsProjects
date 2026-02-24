package org.example.clean_code.lesson_2_fixing_code.task_7.after;

class Programmer implements Workable, Eatable {

    @Override
    public void work() {
        System.out.println("Программист пишет код");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Программист не ест на работе");
    }
}