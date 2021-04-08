package varma.designpatterns.factorymethod;

//Concrete Creators
public class RoadLogistics extends Logistcs {

	public Transport createTransport() {
		return new Truck();
	}

}
