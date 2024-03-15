package Rohith.taxibooking;

public class Taxi implements Cloneable {

    private char currentLocation ='A';
    private int customerId;
    private int TaxiId;
    private char pickUpLocation;
    private char DropLocation;
    private int pickUpTime;
    private int dropTime;
    private int totalEarning;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getDropTime() {
        return dropTime;
    }

    public void setDropTime(int dropTime) {
        this.dropTime = dropTime;
    }

    public int getTaxiId() {
        return TaxiId;
    }

    public void setTaxiId(int taxiId) {
        TaxiId = taxiId;
    }

    public char getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(char currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public char getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(char pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public char getDropLocation() {
        return DropLocation;
    }

    public void setDropLocation(char dropLocation) {
        DropLocation = dropLocation;
    }

    public int getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(int pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public int getTotalEarning() {
        return totalEarning;
    }

    public void setTotalEarning(int totalEarning) {
        this.totalEarning = totalEarning;
    }
    @Override
    public String toString() {
        return "Rohith.Taxi "+getTaxiId()+"\ncurrentLocation=" + currentLocation + ", \ncustomerId=" + customerId + ", \npickupLocation="
                + pickUpLocation + ", \ndropLocation=" + DropLocation + ", \npickupTime=" + pickUpTime + ", \ndropTime="
                + dropTime + ", \ntotal earnings=" + totalEarning + "";
    }



}
