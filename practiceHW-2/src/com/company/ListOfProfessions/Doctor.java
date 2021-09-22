package com.company.ListOfProfessions;

import com.company.AbleTo.CreatingSometimes;
import com.company.AbleTo.InteractionActive;
import com.company.AbleTo.TeachingMiddle;
import com.company.Professions;

public class Doctor extends Professions {

    public Doctor() {
        super(new CreatingSometimes(), new InteractionActive(), new TeachingMiddle());
    }

    @Override
    public void display() {
        System.out.println("It's a Doctor!");
    }

    @Override
    public void improving() {
        System.out.println("i.dont.know.error 666");
    }
}
