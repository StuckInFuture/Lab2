package ru.by.bsuir;

public abstract class Instrument {
    private int mass;

    public Instrument() {
    }

    public Instrument(int newMass) {
        mass = newMass;
    }

    public abstract void work(Billet currentBillet);
}

