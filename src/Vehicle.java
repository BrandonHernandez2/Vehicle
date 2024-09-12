public class Vehicle {
    //POJO:  Plain Old Java Object
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    //Do the same for model

    public void setMake(String make) {
        this.make = make;
    }

    //You do the same for model

}