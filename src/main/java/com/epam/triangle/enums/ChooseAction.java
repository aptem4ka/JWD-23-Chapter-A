package com.epam.triangle.enums;

public enum ChooseAction {
    /**
     * Сам объект enum используется для выбора создаваемой фигуры в FigureCreateManager,
     * а поле amount соответствующего объекта используется в ридере для отбора строки
     * с нужным количеством подстрок для построения фигуры.
     * Для создания трех точек треугольника требуется 6 подстрок с координатами.
     */

    CREATE_TRIANGLE(6);

    private int amount;

    ChooseAction(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
