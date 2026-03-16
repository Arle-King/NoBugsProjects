package org.example.qwerty.OOP;

import java.time.LocalDate;

public class Animal {
    private LocalDate daysBeforeMedEx;
    private String deasonForLeaving;
    private String name;

    public Animal(String name) {
        this.name = name;
        this.daysBeforeMedEx = LocalDate.now().plusYears(1);

    }

    public void MedEx () {
        this.daysBeforeMedEx = LocalDate.now().plusYears(1);
    }

    public void deasonForLeaving(String str) {
        switch (str.toLowerCase()) {
            case "death" : this.deasonForLeaving = "death"; break;
            case "removal" : this.deasonForLeaving = "removal"; break;
            default: throw new IllegalArgumentException("Такой причины нет");
        }
    }

    public LocalDate getDaysBeforeMedEx() {
        return daysBeforeMedEx;
    }

    public String getDeasonForLeaving() {
        return deasonForLeaving;
    }

    public String getName() {
        return name;
    }
}
