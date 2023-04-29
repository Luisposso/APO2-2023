package Vehicles;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private static int totalVehicles = 0;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        totalVehicles++;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public static int getTotalVehicles() {
        return totalVehicles;
    }

    @Override
    public String toString() {
        return "Vehicle number " + getTotalVehicles() + " is a " + make + " " + model;
    }

    public static class Engine extends Vehicle {
        private static final String MAKE = "Predicter";
        private static final int CAPACITY = 1600;
        private String model;

        public Engine(String model) {
            super(MAKE, "", totalVehicles);
            this.model = model;	
        }

        public String getModel() {
            return model;
        }

        public int getCapacity() {
            return CAPACITY;
        }
    }
}
