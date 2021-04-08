package varma.designpatterns.factorymethod;

public class Truck implements Transport {

	// Concrete Class
	@Override
	public String deliver(String goods) {
		return "Delivered via Truck";
	}

}
