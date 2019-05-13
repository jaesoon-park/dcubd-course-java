package ch;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Truck truck = new Truck();
		
		
		driver.drive(bus);
		driver.drive(taxi);
		driver.drive(truck);
	}

}
