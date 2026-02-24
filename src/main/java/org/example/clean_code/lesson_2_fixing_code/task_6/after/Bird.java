package org.example.clean_code.lesson_2_fixing_code.task_6.after;

abstract class Bird {

}

class FlyingBird implements Flyble {
    @Override
    public void fly() {
        System.out.println("Птица летит");
    }
}

class Penguin extends Bird {

}

class Main {
    public void makeBirdFly (FlyingBird bird) {
        bird.fly();
    }
}
