package varma.designpatterns.factorymethod;

// Concrete Creators
public class SeaLogistics extends Logistcs {

	public Transport createTransport() {
		return new Ship();
	}

}
