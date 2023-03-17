import com.kodilla.good.patterns.flying.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FlightSearchTestSuite {

    FlightDatabase database = new FlightDatabase();

    @Test
    void departureEmptyListTest () {
        //Given
        SearchingService service = new SearchingService(database.getDatabase());

        //When
        List<Flight> result = service.findFlightsFromCity("Wroclaw");

        //Then
        Assertions.assertTrue(result.isEmpty());
    }
    @Test
    void arrivalEmptyList() {
        //Given
        SearchingService service = new SearchingService(database.getDatabase());

        //When
        List<Flight> result = service.findFlightsToCity("Wroclaw");

        //Then
        Assertions.assertTrue(result.isEmpty());
    }
    @Test
    void departureNoEmptyListTest () {
        //Given
        SearchingService service = new SearchingService(database.getDatabase());

        //When
        List<Flight> result = service.findFlightsFromCity("Warsaw");

        //Then
        Assertions.assertTrue(result.size()== 2);
    }

    @Test
    void arrivalNoEmptyListTest () {
        //Given
        SearchingService service = new SearchingService(database.getDatabase());

        //When
        List<Flight> result = service.findFlightsToCity("Berlin");

        //Then
        Assertions.assertTrue(result.size()== 2);
    }
    @Test
    void changeFlightEmptyListTest () {
        //Given
        SearchingService service = new SearchingService(database.getDatabase());

        //When
        List<ChangeFlights> result = service.findFlightsWithChange("Wroclaw", "Berlin");

        //Then
        Assertions.assertTrue(result.isEmpty());
    }
    @Test
    void changeFlightNoEmptyListTest () {
        //Given
        SearchingService service = new SearchingService(database.getDatabase());

        //When
        List<ChangeFlights> result = service.findFlightsWithChange("Warsaw", "Oslo");

        //Then
        Assertions.assertTrue(result.size() == 1);
    }

    public static void main(String[] args) {
        FlightDatabase database = new FlightDatabase();
        InformationService info = new InformationService();
        SearchingService service = new SearchingService(database.getDatabase());
        info.displayFlights(service.findFlightsFromCity("Warsaw"));
        info.displayFlights(service.findFlightsToCity("Berlin"));
        info.displayFlights(service.findFlightsWithChange("Warsaw", "Oslo"));


    }
}
