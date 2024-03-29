import com.kodilla.good.patterns.food.delivery.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FoodDeliveryTestSuite {
    Product bread = new Product("B-132", 1);
    Producer extraFood = new ExtraFoodShop();
    Producer healthyShop = new HealthyShop();
    Producer glutenFree = new GlutenFreeShop();
    DeliveryProcessor processor = new DeliveryProcessor();


    @Test
    void correctOrdersTest () {
        //Given
        Order order1 = new Order(bread, extraFood, 12.5);
        Order order2 = new Order(bread, healthyShop, 12.5);
        Order order3 = new Order(bread, glutenFree, 12.5);

        //When
        boolean result1 = processor.deliveryProcess(order1);
        boolean result2 = processor.deliveryProcess(order2);
        boolean result3 = processor.deliveryProcess(order3);

        //Then
        Assertions.assertTrue(result1);
        Assertions.assertTrue(result2);
        Assertions.assertTrue(result3);
    }
    @Test
    void healthyShopQuantityTest () {

        //Given
        Order order = new Order(bread, healthyShop, 9.0);

        //When
        boolean result = processor.deliveryProcess(order);

        //Then
        Assertions.assertFalse(result);
    }

}
