package com.company.ListOfProfessions;

import com.company.*;
import com.company.AbleTo.*;

public class Cooker extends Professions {
    public Cooker() {
        super(new CreatingProfession(), new InteractionLow() ,new TeachingLow());
    }

    @Override
    public void display() {
        System.out.println("It's a Cooker.");
    }

    @Override
    public void improving() {
        // шеф
        setAbleToInteract(new InteractionActive());
        setAbleToTeach(new TeachingMiddle());
        System.out.println("Now it's a усатый chief from КУХНЯ.");
    }
}
