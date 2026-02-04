package org.example.restaurant;


public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Dish borsh = new HotDish("Борщ", 65);
        Dish drink = new Drink("Мохито", 450);


        menu.addDish(borsh);
        menu.addDish(drink);
        menu.addDish(drink);
        menu.addDish(drink);
        menu.addDish(drink);
        menu.addDish(drink);

        menu.printMenu();
    }
}
