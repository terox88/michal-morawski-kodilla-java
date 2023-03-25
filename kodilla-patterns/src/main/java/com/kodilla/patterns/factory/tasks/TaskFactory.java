package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPING -> new ShoppingTask("Monday shopping", "potatoes",2.5);
            case PAINTING -> new PaintingTask("Room painting", "blue", "bedroom");
            case DRIVING -> new DrivingTask("Journey", "Lidl", "bike");
            default -> null;
        };
    }
}
