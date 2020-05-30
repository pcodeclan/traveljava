public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType){
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() {
        return this.planeType;
    }

    public int getCapacity(){
        return this.planeType.getCapacity();
    }

    public double getTotalWeight(){
        return this.planeType.getTotalWeight();
    }
}
