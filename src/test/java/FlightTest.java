import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane1;


    @Before
    public void setUp(){
        plane1 = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane1, "FR756", "GLA", "EDI", "10:00");
    }

    @Test
    public void canGetPlaneSeats(){
        assertEquals(20, flight.getPlaneSeats());
    }

}
