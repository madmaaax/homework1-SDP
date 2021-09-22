package com.company.ListOfProfessions;

import com.company.AbleTo.CreatingDoesNot;
import com.company.AbleTo.InteractionActive;
import com.company.AbleTo.TeachingLow;
import com.company.Professions;

public class Driver extends Professions {
    public Driver() {
        super(new CreatingDoesNot(), new InteractionActive(), new TeachingLow());
    }

    @Override
    public void display() {
        System.out.println("It's a Driver.");
    }

    @Override
    public void improving() {
        System.out.println("No perspective.");
    }
}
