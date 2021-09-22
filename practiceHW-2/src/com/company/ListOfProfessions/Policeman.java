package com.company.ListOfProfessions;

import com.company.AbleTo.CreatingDoesNot;
import com.company.AbleTo.InteractionActive;
import com.company.AbleTo.TeachingLow;
import com.company.Professions;

public class Policeman extends Professions {
    public Policeman() {
        super(new CreatingDoesNot(), new InteractionActive(), new TeachingLow());
    }

    @Override
    public void display() {
        System.out.println("It's a Policeman.");
    }

    @Override
    public void improving() {
        System.out.println("i.dont.know.error 666");
    }
}
