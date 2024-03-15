package Rohith.taxibooking;

import java.util.ArrayList;

public class Booking {
    static ArrayList<Taxi> taxiList = new ArrayList<>();
    static int taxiListLimit = 4;
    static int idGenerator = 1;
    static ArrayList<Taxi> taxiBookedHistory = new ArrayList<>();

    public static String booking(char pickUpLocation, char DropLocation, int pickUpTime) throws CloneNotSupportedException {

        if(taxiList.size()<taxiListLimit){
            taxiList.add(new Taxi());
        }
        int min = Integer.MAX_VALUE;
        Taxi taxiReady = null;
        for(Taxi t:taxiList){
            if(t.getDropTime()<=pickUpTime && Math.abs(pickUpLocation - t.getCurrentLocation())<min){
                taxiReady = t;
                min = Math.abs(pickUpLocation - t.getCurrentLocation());
            }
        }
        if (taxiReady!=null){
            taxiReady.setCustomerId(idGenerator);
            taxiReady.setPickUpTime(pickUpTime);
            taxiReady.setPickUpLocation(pickUpLocation);
            taxiReady.setDropLocation(DropLocation);
            taxiReady.setDropTime(pickUpTime+Math.abs(pickUpLocation-DropLocation));
            taxiReady.setTotalEarning(taxiReady.getTotalEarning()+Math.abs(DropLocation-pickUpLocation)*200);
            taxiReady.setTaxiId(taxiList.indexOf(taxiReady)+1);
            taxiBookedHistory.add((Taxi)taxiReady.clone());

        }
        return taxiReady!=null?"Taxi Number "+taxiReady.getTaxiId() +" is Booked":"Taxis is not available";

    }
    public static void display(){
        System.out.println(".........................");
        for (Taxi t:taxiBookedHistory){
            System.out.println(t.toString());
            System.out.println(".............");
        }

    }
}
