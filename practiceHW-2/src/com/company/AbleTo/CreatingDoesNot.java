package com.company.AbleTo;

import com.company.Interfaces.AbleToCreate;

public class CreatingDoesNot implements AbleToCreate {
    @Override
    public void creating() {
        System.out.println("Doesn't create anything.");
    }
}
