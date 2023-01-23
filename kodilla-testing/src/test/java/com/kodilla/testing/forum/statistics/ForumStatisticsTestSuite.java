package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
@DisplayName("ForumStatistics tests")
public class ForumStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;
    private ForumStatistics statistics;
    private List<String> usersList;
    private int postsCount;
    private int commentsCount;
    private static int testCounter;


    private List<String> generateUsersList(int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        for(int i = 1; i <= usersQuantity; i++) {
            resultList.add("User " + i);
        }
        return resultList;
    }
    @BeforeEach
    public void before() {
        usersList = generateUsersList(80);
        postsCount = 90;
        commentsCount =70;
        testCounter++;
        System.out.println("\nProcessing test number " + testCounter);
    }
    @AfterEach public void after() {
        statistics.showStatistics();
    }

    @DisplayName("Test for no post on forum")
    @Test
    public void zeroPostTest() {

        //Given
        statistics = new ForumStatistics();
        postsCount = 0;
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);


        //When
        statistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(80, statistics.getUsersNumber());
        Assertions.assertEquals(0, statistics.getPostsCount());
        Assertions.assertEquals(0, statistics.getCommentsCount());
        Assertions.assertEquals(0, statistics.getAveragePostsToUser());
        Assertions.assertEquals(0, statistics.getAverageCommentsToUser());
        Assertions.assertEquals(0, statistics.getAverageCommentsToPost());

    }
    @DisplayName("Test for zero comments")
    @Test
    public void zeroCommentsTest() {

        //Given
        statistics = new ForumStatistics();
        commentsCount = 0;
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);

        //When
        statistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(80, statistics.getUsersNumber());
        Assertions.assertEquals(90, statistics.getPostsCount());
        Assertions.assertEquals(0, statistics.getCommentsCount());
        Assertions.assertEquals(1.125, statistics.getAveragePostsToUser());
        Assertions.assertEquals(0.0, statistics.getAverageCommentsToUser());
        Assertions.assertEquals(0.0, statistics.getAverageCommentsToPost());
    }
    @DisplayName("Test for 1000 posts and when posts count is bigger than comments count")
    @Test
    public void thousandPostTest() {

        //Given
        statistics = new ForumStatistics();
        postsCount = 1000;
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);

        //When
        statistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(80, statistics.getUsersNumber());
        Assertions.assertEquals(1000, statistics.getPostsCount());
        Assertions.assertEquals(70, statistics.getCommentsCount());
        Assertions.assertEquals(12.5, statistics.getAveragePostsToUser());
        Assertions.assertEquals(0.875, statistics.getAverageCommentsToUser());
        Assertions.assertEquals(0.07, statistics.getAverageCommentsToPost());

    }

    @DisplayName("Test when comments count is bigger than posts count")
    @Test
    public void commentsBiggerThanPostsTest() {

        //Given
        statistics = new ForumStatistics();
        commentsCount = 99;
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);

        //When
        statistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(80, statistics.getUsersNumber());
        Assertions.assertEquals(90, statistics.getPostsCount());
        Assertions.assertEquals(99, statistics.getCommentsCount());
        Assertions.assertEquals(1.125, statistics.getAveragePostsToUser());
        Assertions.assertEquals(1.2375, statistics.getAverageCommentsToUser());
        Assertions.assertEquals(1.1, statistics.getAverageCommentsToPost());

    }

    @DisplayName("Test zero users")
    @Test
    public void zeroUsersTest() {

        //Given
        statistics = new ForumStatistics();
        usersList.clear();
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);

        //When
        statistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0, statistics.getUsersNumber());
        Assertions.assertEquals(0, statistics.getPostsCount());
        Assertions.assertEquals(0, statistics.getCommentsCount());
        Assertions.assertEquals(0, statistics.getAveragePostsToUser());
        Assertions.assertEquals(0, statistics.getAverageCommentsToUser());
        Assertions.assertEquals(0, statistics.getAverageCommentsToPost());

    }

    @DisplayName("Test for one hundred users")
    @Test
    public void hundredUsersPostsTest() {

        //Given
        statistics = new ForumStatistics();
        usersList = generateUsersList(100);
        postsCount = 140;
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);

        //When
        statistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(100, statistics.getUsersNumber());
        Assertions.assertEquals(140, statistics.getPostsCount());
        Assertions.assertEquals(70, statistics.getCommentsCount());
        Assertions.assertEquals(1.4, statistics.getAveragePostsToUser());
        Assertions.assertEquals(0.7, statistics.getAverageCommentsToUser());
        Assertions.assertEquals(0.5, statistics.getAverageCommentsToPost());

    }


}
