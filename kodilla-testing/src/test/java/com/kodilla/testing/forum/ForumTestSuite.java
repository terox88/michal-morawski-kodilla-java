package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;


@DisplayName( "Forum test suite")
public class ForumTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case begin:");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }
    @DisplayName("When created SimpleUser with real name, then realName should return correct real name")

    @Test
    public void testCaseRealName() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");

        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing: " + result);

        //Then
        Assertions.assertEquals("John Smith", result);
    }
    @DisplayName("When created SimpleUser with name, then getUserName should return correct name")
    @Test
    public void testCaseUsername () {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        //When
        String result = simpleUser.getUserName();
        String expectedResult = "theForumUser";

        //Then
        Assertions.assertEquals(expectedResult, result);


        }
}



