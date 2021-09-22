package com.company;

import com.company.Interfaces.AbleToCreate;
import com.company.Interfaces.AbleToInteract;
import com.company.Interfaces.AbleToTeach;

public abstract class Professions {
    abstract public void display();
    abstract public void improving();


    private AbleToCreate ableToCreate;
    private AbleToInteract ableToInteract;
    private AbleToTeach ableToTeach;

    public Professions(AbleToCreate ableToCreate, AbleToInteract ableToInteract, AbleToTeach ableToTeach) {
        this.ableToCreate = ableToCreate;
        this.ableToInteract = ableToInteract;
        this.ableToTeach = ableToTeach;
    }

    public void information(){
        this.ableToCreate.creating();
        this.ableToInteract.publicInteracting();
        this.ableToTeach.teaching();
    }


    public AbleToCreate getAbleToCreate() {
        return ableToCreate;
    }

    public void setAbleToCreate(AbleToCreate ableToCreate) {
        this.ableToCreate = ableToCreate;
    }

    public AbleToInteract getAbleToInteract() {
        return ableToInteract;
    }

    public void setAbleToInteract(AbleToInteract ableToInteract) {
        this.ableToInteract = ableToInteract;
    }

    public AbleToTeach getAbleToTeach() {
        return ableToTeach;
    }

    public void setAbleToTeach(AbleToTeach ableToTeach) {
        this.ableToTeach = ableToTeach;
    }
}
