package com.company.ListOfProfessions;

import com.company.*;
import com.company.AbleTo.CreatingProfession;
import com.company.AbleTo.InteractionLow;
import com.company.AbleTo.InteractionMiddle;
import com.company.AbleTo.TeachingLow;

public class Builder extends Professions {
    public Builder() {
        super(new CreatingProfession(), new InteractionLow(), new TeachingLow());
    }

    @Override
    public void display() {
        System.out.println("It's a Builder");
    }

    @Override
    public void improving() {
        setAbleToInteract(new InteractionMiddle());
        System.out.println("Now it's a Director of BI Group. SHEESH!!!");
    }
}
