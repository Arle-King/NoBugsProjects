package org.example.clean_code.lesson_2_fixing_code.task_6.before;

class Bird {
    public void fly() {
        System.out.println("Птица летит");
    }
}
class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Пингвины не летают");
    }
}
