package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: Forum Test Suite")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Nested
    @DisplayName("Tests for adding and removing figure")
    class AddAndRemoveFigureTest {
        @Test
        void testAddFigure() {

            //Given
            Shape circle = new Circle(3);
            ShapeCollector collector = new ShapeCollector();

            //When
            collector.addFigure(circle);

            //Then
            Assertions.assertEquals(1, collector.getShapeList().size());

        }

        @Test
        void testRemoveFigureNotExisting() {
            //Given
            Shape square = new Square(2.0);
            ShapeCollector collector = new ShapeCollector();

            //When
            boolean result = collector.removeFigure(square);

            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testRemoveFigure() {
            //Given
            Shape triangle = new Triangle(3, 4);
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(triangle);
            //When
            boolean result = collector.removeFigure(triangle);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertTrue(collector.getShapeList().isEmpty());
        }
    }

    @Nested
    @DisplayName("Tests for getting and shows figures")
    class TestGettingAndShowsFigures {

        @Test
        void testGetFigure() {
            //Given
            Shape circle = new Circle(3);
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(circle);

            //When
            Shape retrievedFigure = collector.getFigure(0);

            //Then
            Assertions.assertEquals(circle, retrievedFigure);
        }
        @Test
        void testShowFiguresEmptyList() {
            //Given
            ShapeCollector collector = new ShapeCollector();

            //When
            String result = collector.showFigures();

            //Then
            Assertions.assertEquals("No figures in collection", result);
        }
        @Test
        void testShowFigures() {
            //Given
            Shape circle = new Circle(3);
            Shape triangle = new Triangle(4, 6);
            Shape square = new Square(4);
            Shape circle1 = new Circle(2);
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(circle);
            collector.addFigure(triangle);
            collector.addFigure(square);
            collector.addFigure(circle1);

            //When
            String result = collector.showFigures();

            //Then
            Assertions.assertEquals("Circle, Triangle, Square, Circle", result);
        }

    }

}
