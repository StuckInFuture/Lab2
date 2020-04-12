package ru.by.bsuir;

import java.util.Scanner;

public class Screwdriver extends Instrument {
    public Screwdriver() {
    }

    @Override
    public void work(Billet currentBillet) {
        if (currentBillet.getProduct().getReadinessStatus() == true) {
            untwist(currentBillet);
        } else twist(currentBillet);
    }

    public void twist(Billet currentBillet) {
        currentBillet.getProduct().setReadinessStatus(true);
    }

    public void untwist(Billet currentBillet) {
        currentBillet.getProduct().setReadinessStatus(false);
    }
}
