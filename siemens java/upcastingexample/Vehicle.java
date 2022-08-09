package upcastingexample;

abstract public class Vehicle {
    String vehicleRegnumber;
    String vehicleBrand;
    Category vehicleCategory;
    float vehiclePrice;


    public Vehicle(String vehicleRegnumber, String vehicleBrand, Category vehicleCategory, float vehiclePrice) {
        this.vehicleRegnumber = vehicleRegnumber;
        this.vehicleBrand = vehicleBrand;
        this.vehicleCategory = vehicleCategory;
        this.vehiclePrice = vehiclePrice;
    }

    public String getVehicleRegnumber() {
        return this.vehicleRegnumber;
    }

    public void setVehicleRegnumber(String vehicleRegnumber) {
        this.vehicleRegnumber = vehicleRegnumber;
    }

    public String getVehicleBrand() {
        return this.vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public Category getVehicleCategory() {
        return this.vehicleCategory;
    }

    public void setVehicleCategory(Category vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public float getVehiclePrice() {
        return this.vehiclePrice;
    }

    public void setVehiclePrice(float vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    @Override
    public String toString() {
        return "{" +
            " vehicleRegnumber='" + getVehicleRegnumber() + "'" +
            ", vehicleBrand='" + getVehicleBrand() + "'" +
            ", vehicleCategory='" + getVehicleCategory() + "'" +
            ", vehiclePrice='" + getVehiclePrice() + "'" +
            "}";
    }
    
    abstract void calculateRtoTax();
    
}