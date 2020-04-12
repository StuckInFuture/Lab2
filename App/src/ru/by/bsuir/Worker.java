package ru.by.bsuir;

public class Worker {
    private Instrument currentInstrument;
    public Worker(){}
    public void toDo(Billet currentBillet){
        currentInstrument.work(currentBillet);
    }
    public void setCurrentInstrument(Instrument newInstrument){
        currentInstrument = newInstrument;
    };
}
