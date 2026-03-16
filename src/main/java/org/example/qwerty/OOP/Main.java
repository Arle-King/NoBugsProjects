package org.example.qwerty.OOP;

public class Main {
    /*
    Зоопарк
    Добавить новое животное,
    раз в год медком и нужно определить, когда след медком
    когда животное уходит -> либо смерть, либо переезд
     */
    public static void main(String[] args) {
        Manager manager = new Manager();

        Animal animal = new Animal("Слон");
        Animal animal2 = new Animal("Птица");
        Animal animal3 = new Animal("Рыба");

        manager.addAnimal(animal);
        manager.addAnimal(animal2);
        manager.addAnimal(animal3);

        manager.deasonForLeaving(animal2.getName(), "removal");

        manager.printZoo();

    }
}
