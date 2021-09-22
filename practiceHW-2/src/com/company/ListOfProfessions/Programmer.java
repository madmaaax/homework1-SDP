package com.company.ListOfProfessions;

import com.company.*;
import com.company.AbleTo.*;

public class Programmer extends Professions {

    public Programmer() {
        super(new CreatingProfession(), new InteractionMiddle(), new TeachingMiddle());
    }

    @Override
    public void display() {
        System.out.println("It is a Programmer!");
    }

    @Override
    public void improving() {
        // teamLead
        setAbleToInteract(new InteractionActive());
        setAbleToTeach(new TeachingEasily());
        System.out.println("Now it's a TeamLeader.");
    }
}
