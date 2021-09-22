package com.company.ListOfProfessions;

import com.company.AbleTo.CreatingDoesNot;
import com.company.AbleTo.InteractionMiddle;
import com.company.AbleTo.TeachingLow;
import com.company.Professions;

public class Cleaner extends Professions {
    public Cleaner() {
        super(new CreatingDoesNot(), new InteractionMiddle(), new TeachingLow());
    }

    @Override
    public void display() {
        System.out.println("It's a Cleaner");
    }

    @Override
    public void improving() {
        System.out.println("No perspective.");
    }
}
