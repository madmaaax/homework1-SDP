package com.company.AbleTo;

import com.company.Interfaces.AbleToInteract;

public class InteractionMiddle implements AbleToInteract {
    @Override
    public void publicInteracting() {
        System.out.println("Can interact with public.");
    }
}
