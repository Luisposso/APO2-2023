package Vehicles;

public class TestVehicle {
	 public static void main(String[] args) {
	        Vehicle vehicle1 = new Vehicle("Ford", "Mustang", 1969);
	        Vehicle vehicle2 = new Vehicle("Chevrolet", "Camaro", 1967);
	        Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune");

	        vehicle2.setMake("Seer");

	        System.out.println(vehicle1.toString());
	        System.out.println(vehicle2.toString());
	        System.out.println("Vehicle number " + Vehicle.getTotalVehicles() + " is a " + vehicle3.getModel() + " model and has an engine capacity of " + vehicle3.getCapacity() + "cc");
	    }
	}
