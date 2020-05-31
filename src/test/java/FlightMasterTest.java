import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightMasterTest {

    private FlightMaster flightMaster;
    private Plane plane;
    private Flight flight;
    private Passenger passenger1, passenger2;

    @Before
    public void setUp(){
        this.plane = new Plane(PlaneType.BOEING747);
        this.flight = new Flight(plane, "FR756", "GLA", "EDI", "10:00");
        this.passenger1 = new Passenger("Gregg", 2);
        this.passenger2 = new Passenger("Mark", 1);
        this.flightMaster = new FlightMaster();
    }

    @Test
    public void canGetBagWeightPP(){
        assertEquals(100, flightMaster.getbagWeightPP(flight), 0.01);
    }

    //    calculate how much baggage weight is booked by passengers of a flight
    @Test
    public void canGetBagWeightTotal(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(300, flightMaster.getBagWeightTotal(flight), 0.01);
    }

    @Test
    public void canGetRemainingBagWeight(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(200, flightMaster.getRemainingBagWeight(flight), 0.01);
    }


}
