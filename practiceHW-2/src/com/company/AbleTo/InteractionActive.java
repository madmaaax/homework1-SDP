package com.company.AbleTo;

import com.company.Interfaces.AbleToInteract;

public class InteractionActive implements AbleToInteract {
    @Override
    public void publicInteracting() {
        System.out.println("Can actively interact with public.");
    }
}
