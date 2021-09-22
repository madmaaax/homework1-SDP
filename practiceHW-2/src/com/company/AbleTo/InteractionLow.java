package com.company.AbleTo;

import com.company.Interfaces.AbleToInteract;

public class InteractionLow implements AbleToInteract {
    @Override
    public void publicInteracting() {
        System.out.println("Can't or Don't interact with public.");
    }
}
