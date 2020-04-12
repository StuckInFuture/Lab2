package ru.by.bsuir;

public class JackPlane extends Instrument {
    public JackPlane(){}
    @Override
    public void work(Billet currentBillet) {
        currentBillet.setShape("Planed");
    }
}
