package upcastingexample;

public class Car extends Vehicle {
    Boolean carHasSunroof;
    Sound_System carSound_String vehicleRegSystem;

    public Car(String vehicleRegnumber, String vehicleBrand, Category vehicleCategory,Boolean carHasSunroof, Sound_System carSound_System, float vehiclePrice) 
    {
        super (vehicleRegnumber, vehicleBrand, vehicleCategory, vehiclePrice);

        this.carHasSunroof = carHasSunroof;
        this.carSound_System = carSound_System;
    }
    @Override
    void calculateRtoTax(){
         System.out.println(this.getVehiclePrice()    *   0.25);
    }
    
}
