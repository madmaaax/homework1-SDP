package com.company.ListOfProfessions;

import com.company.*;
import com.company.AbleTo.CreatingProfession;
import com.company.AbleTo.CreatingSometimes;
import com.company.AbleTo.InteractionActive;
import com.company.AbleTo.TeachingEasily;

public class Teacher extends Professions {
    public Teacher() {
        super(new CreatingSometimes(), new InteractionActive(), new TeachingEasily());
    }

    @Override
    public void display() {
        System.out.println("It's a Teacher!");
    }

    @Override
    public void improving() {
        // create own course to prepare to IELTS
        setAbleToCreate(new CreatingProfession());
        System.out.println("Now it's a CEO of English Courses");
    }
}
