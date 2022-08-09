package upcastingexample;

public class Bike extends Vehicle{
    BikeType btype;
    boolean bikehasbackRest;


    public Bike(BikeType btype, boolean bikehasbackRest) {
        this.btype = btype;
        this.bikehasbackRest = bikehasbackRest;
    }
   
    @Override
    void calculateRtoTax(){
        System.out.println(this.getVehiclePrice()    *   0.1);
         
    }
    }
