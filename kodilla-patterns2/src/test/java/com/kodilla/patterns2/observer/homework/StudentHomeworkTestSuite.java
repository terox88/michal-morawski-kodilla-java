package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentHomeworkTestSuite {
    @Test
    void updateTest() {
        //Given
        Mentor mentorJohn = new MentorJohn();
        Mentor mentorAlice = new MentorAlice();
        StudentHomework alanHomework = new StudentHomework("Alan");
        StudentHomework gwenHomework = new StudentHomework("Gwen");
        StudentHomework paulHomework = new StudentHomework("Paul");
        StudentHomework stacyHomework = new StudentHomework("Stacy");
        alanHomework.registerObserver(mentorJohn);
        gwenHomework.registerObserver(mentorJohn);
        paulHomework.registerObserver(mentorAlice);
        stacyHomework.registerObserver(mentorAlice);
        //When
        alanHomework.sendExercise("www.alan-1.com");
        alanHomework.sendExercise("www.alan-2.com");
        gwenHomework.sendExercise("www.gwen-1.com");
        paulHomework.sendExercise("www.paul-1,com");
        stacyHomework.sendExercise("www.stacy-1.com");
        stacyHomework.sendExercise("www.stacy-2.com");
        stacyHomework.sendExercise("www.stacy-3.com");
        //Then
        Assertions.assertEquals(3, mentorJohn.getUpdateCount());
        Assertions.assertEquals(4, mentorAlice.getUpdateCount());

    }
}
