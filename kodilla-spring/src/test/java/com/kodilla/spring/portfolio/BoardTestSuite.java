package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {
    @Test
    void testTaskAdd () {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getToDoList().getTasks().add("Task to do");
        board.getInProgressList().getTasks().add("Task in progress");
        board.getDoneList().getTasks().add("Task done");

        //When
        String taskToDo = board.getToDoList().getTasks().get(0);
        String taskInProgress = board.getInProgressList().getTasks().get(0);
        String taskDone = board.getDoneList().getTasks().get(0);

        //Then
        Assertions.assertEquals("Task to do", taskToDo);
        Assertions.assertEquals("Task in progress", taskInProgress);
        Assertions.assertEquals("Task done", taskDone);
    }
}
