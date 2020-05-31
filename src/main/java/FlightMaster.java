public class FlightMaster {

    private double bagWeightPP;
    private int totalNumBags;

    public FlightMaster(){
        this.bagWeightPP = 0;
        this.totalNumBags = 0;
    }
    public double getbagWeightPP(Flight flight){
        //Planes reserve half of their total weight for passenger bags
        //The weight of bag per person is the weight reserved for passenger bags divided by the capacity
        this.bagWeightPP = (flight.getPlaneWeight()/2) / flight.getPlaneCapacity();
        return bagWeightPP;
    }

    public double getBagWeightTotal(Flight flight) {
        //Get passenger numOfBags from Passenger ArrayList
        // FlightMaster > Flight > Passenger
        this.totalNumBags = flight.getAllPassengerNumOfBags();
        getbagWeightPP(flight);
        return this.totalNumBags * this.bagWeightPP;
        //getBagweightPP / passenger numofbags
    }


//    calculate how much overall weight reserved for baggage remains for a flight
    public double getRemainingBagWeight(Flight flight) {
        return (flight.getPlaneWeight()/2) - getBagWeightTotal(flight);
}
}
