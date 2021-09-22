package com.company;

import com.company.ListOfProfessions.Cooker;
import com.company.ListOfProfessions.Driver;
import com.company.ListOfProfessions.Programmer;

public class Main {
    public static void main(String[] args) {
        Professions professions = new Driver();
        professions.display();
        professions.information();

        System.out.println("\nAfter 5-10 years\n");

        professions.improving();
        professions.information();
    }
}
