package varma.designpatterns.factorymethod;

public class Ship implements Transport {

	// Concrete Class
	@Override
	public String deliver(String goods) {
		return "Delivered via Ship";
	}

}
