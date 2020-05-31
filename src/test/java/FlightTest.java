import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane1;
    Passenger passenger1, passenger2, passenger3, passenger4, passenger5, passenger6;


    @Before
    public void setUp(){
        plane1 = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane1, "FR756", "GLA", "EDI", "10:00");
        passenger1 = new Passenger("Gregg", 2);
        passenger2 = new Passenger("Mark", 1);
        passenger3 = new Passenger("Julie", 3);
        passenger4 = new Passenger("Roland", 1);
        passenger5 = new Passenger("Trey", 1);
        passenger6 = new Passenger("Harambe", 2);

    }

    @Test
    public void canGetPlaneSeats(){
        assertEquals(5, flight.getPlaneSeats());
    }

    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger1);
        assertEquals(4, flight.getPlaneSeats());
    }

    @Test
    public void canGetPlaneWeight(){
        assertEquals(1000, flight.getPlaneWeight(), 0.01);
    }

    @Test
    public void canGetPlaneCapacity(){
        assertEquals(5, flight.getPlaneCapacity(), 0.01);
    }

    @Test
    public void canGetAllPassengerNumOfBags(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(3, flight.getAllPassengerNumOfBags());
    }



//    @Test
//    public void wontBookPassengerIfNoSeats(){
//        flight.bookPassenger(passenger1);
//        flight.bookPassenger(passenger2);
//        flight.bookPassenger(passenger3);
//        flight.bookPassenger(passenger4);
//        flight.bookPassenger(passenger5);
//        flight.bookPassenger(passenger6);
//    }

}
