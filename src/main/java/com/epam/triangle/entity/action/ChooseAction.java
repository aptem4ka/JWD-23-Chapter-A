package com.epam.triangle.entity.action;

public enum ChooseAction {

    CREATE_TRIANGLE(6); //we need to read 6 values to create a triangle

    private int amount;

    ChooseAction(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
