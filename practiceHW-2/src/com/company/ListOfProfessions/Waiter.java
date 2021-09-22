package com.company.ListOfProfessions;

import com.company.*;
import com.company.AbleTo.*;

public class Waiter extends Professions {
    public Waiter() {
        super(new CreatingDoesNot(), new InteractionActive(), new TeachingLow());
    }



    @Override
    public void display() {
        System.out.println("It's a Builder");
    }

    @Override
    public void improving() {
        // manager
        setAbleToCreate(new CreatingSometimes());
        setAbleToTeach(new TeachingEasily());
        System.out.println("Now it's a Manager of service.");
    }
}
