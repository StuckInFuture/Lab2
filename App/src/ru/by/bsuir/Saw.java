package ru.by.bsuir;

public class Saw extends Instrument {
    private int length;

    public Saw() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int newLength) {
        length=newLength;
    }

    @Override
    public void work(Billet currentBillet) {
        currentBillet.setShape("Sawed");
    }
}
