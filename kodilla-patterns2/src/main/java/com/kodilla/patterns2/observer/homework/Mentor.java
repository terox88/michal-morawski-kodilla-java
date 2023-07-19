package com.kodilla.patterns2.observer.homework;

public class Mentor implements HomeworkObserver {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }


    @Override
    public void update(StudentHomework homework) {
        System.out.println("Student " + homework.getStudentName() + " send new exercise to check. You find it on:\n" + homework.getExercises().get(homework.getExercises().size()-1));
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
