package varma.designpatterns.factorymethod;

//Creator Class
public class Logistcs {

	// Factory Method
	public Transport createTransport(String typeOfTransport) {
		if (typeOfTransport.equalsIgnoreCase("Water")) {
			return new SeaLogistics().createTransport();
		} else {
			return new RoadLogistics().createTransport();
		}
	}
	// Factory Method

	public static void main(String[] args) {
		String typeOfTransport = "Road";
		String delivery = "Goods";
		Logistcs logistics = new Logistcs();
		Transport transport = logistics.createTransport(typeOfTransport);
		String status = transport.deliver(delivery);
		System.out.println(status);
	}
}
