package com.company.AbleTo;

import com.company.Interfaces.AbleToTeach;

public class TeachingLow implements AbleToTeach {
    @Override
    public void teaching() {
        System.out.println("Can't or don't teach other people.");
    }
}
