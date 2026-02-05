package org.example.lesson_3_static_final_and_access_modifier;

public class Main {
    public static void main(String[] args) {

        //Company
        Company employeeFirst = new Company(0, "Глеб");
        Company employeeSecond = new Company(1, "Альбина");
        Company employeeThird = new Company(2, "Глеб2");

        Company.companyName = "NoBugs";
        Company.printCompanyName();

        //MathConstants
        System.out.println(MathConstants.calculateCircleArea(Math.random() * 100));
        System.out.println(MathConstants.calculateCircleArea(Math.random() * 100));
        System.out.println(MathConstants.calculateCircumference(Math.random() * 100));
        System.out.println(MathConstants.calculateCircumference(Math.random() * 100));

        //Library в другом классе
        //University
        University firstStudent = new University( 0,  "Гнеб");
        University secondStudent = new University( 1,  "Альбина");
        University thirdStudent = new University( 2,  "Гнеб2");

        University.universityName = "NoBugs";

        firstStudent.printStudentInfo();
        secondStudent.printStudentInfo();
        thirdStudent.printStudentInfo();

        //GameSettings
        GameSettings firstGame = new GameSettings("Doka 2");
        GameSettings secondGame = new GameSettings( "WarFace");

        GameSettings.setMaxPlayers(30);

        firstGame.addPlayer();
        firstGame.addPlayer();

        secondGame.addPlayer();

        firstGame.printGameStatus();
        secondGame.printGameStatus();

        //Person
        Person firstPerson = new Person("Гнеб",  "Иванович",  "123-45-6789");
        Person secondPerson = new Person( "Нюпа",  "Олеговна",  "987-65-4321");

        firstPerson.setFirstName("Павлен");
        firstPerson.setLastName("Фамилия");

        firstPerson.printPersonInfo();
        secondPerson.printPersonInfo();
    }
}
