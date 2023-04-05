package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;


    @Test
    void taskListDaoFindByTasklistName() {
        //Given
        TaskList taskList = new TaskList("To do", "Things you must do ASAP");
        taskListDao.save(taskList);
        String name = taskList.getListName();

        //When
        List<TaskList> readTaskList = taskListDao.findByListName(name);


        //Then
        int id = readTaskList.get(0).getId();
        Assertions.assertEquals(1,readTaskList.size());
        //Clean up
        taskListDao.deleteById(id);

    }
}
