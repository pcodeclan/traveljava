import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNum;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private int planeSeats;

    public Flight(Plane plane, String flightNum,String destination,String departureAirport, String departureTime){
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.planeSeats = plane.getCapacity();
    }

    public int getPlaneSeats(){
        return this.planeSeats;
    }


}
