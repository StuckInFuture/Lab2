package ru.by.bsuir;

public class Product {
    private boolean readinessStatus;

    public Product() {
        readinessStatus = false;
    }

    public Product(boolean status) {
        readinessStatus = status;
    }

    public boolean checkReadiness() {
        return readinessStatus;
    }

    public boolean getReadinessStatus() {
        return readinessStatus;
    }

    public void setReadinessStatus(boolean status) {
        readinessStatus = status;
    }
}
