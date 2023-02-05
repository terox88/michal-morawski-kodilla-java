import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightSearch;
import com.kodilla.exception.test.RouteNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

public class FlightSearchTestSuite {
    @Test
    @DisplayName("Check if method throw exception when destination isn't included in database")
    public void noAirportInDatabase () {
        //Given
        Flight flight = new Flight("Gdynia", "Chicago");
        FlightSearch flightSearch = new FlightSearch();

        //When and Then
        Assertions.assertThrows(RouteNotFoundException.class, () ->flightSearch.findFlight(flight));
    }

    @Test
    @DisplayName("Check if method dont' t throw exception when destination is included in database")
    public void airportInDatabaseExists () {
        //Given
        Flight flight = new Flight("Gdynia", "Kozia Wólka");
        FlightSearch flightSearch = new FlightSearch();

        //When and Then
        Assertions.assertDoesNotThrow(() ->flightSearch.findFlight(flight));
    }

}
