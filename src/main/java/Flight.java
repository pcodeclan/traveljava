import java.util.ArrayList;

public class Flight {

    private Passenger passenger;
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
    public double getPlaneWeight(){
        return this.plane.getTotalWeight();
    }

    public double getPlaneCapacity() {
        return this.plane.getCapacity();
    }

    public int getPlaneSeats(){
        return this.planeSeats;
    }

    //Get all elements inside arraylist and extract numofbags property
    public int getAllPassengerNumOfBags(){
        int totalBags = 0;
        for (Passenger passenger : passengers){
            totalBags = totalBags + passenger.getNumOfBags();
        }
        return totalBags;
    }

    //Check if there are seats remaining
    //If YES then add passenger to passenger array
    public void bookPassenger(Passenger passenger){
        if (this.passengers.size() < getPlaneSeats()) {
            this.passengers.add(passenger);
            this.planeSeats --;
        }
    }


}
