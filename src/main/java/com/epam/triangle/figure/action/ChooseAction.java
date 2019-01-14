package com.epam.triangle.figure.action;

public enum ChooseAction {

    CREATE_TRIANGLE(6);

    private int amount;

    ChooseAction(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
