package com.company.ListOfProfessions;

import com.company.*;
import com.company.AbleTo.CreatingProfession;
import com.company.AbleTo.InteractionLow;
import com.company.AbleTo.InteractionMiddle;
import com.company.AbleTo.TeachingLow;

public class Miner extends Professions {
    public Miner() {
        super(new CreatingProfession(), new InteractionLow(), new TeachingLow());
    }

    @Override
    public void display() {
        System.out.println("It's a Miner");
    }

    @Override
    public void improving() {
        // director
        setAbleToInteract(new InteractionMiddle());
        System.out.println("Now it's a CEO of Karagandy Komir Zavod.");
    }
}
