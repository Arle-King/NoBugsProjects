package org.example.lesson_3_static_final_and_access_modifier;

public class Company {
    public static String companyName;
    private final int employeeID;
    private String employeeName;

    public Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public static void printCompanyName() {
        System.out.println("Название компании: " + companyName);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
