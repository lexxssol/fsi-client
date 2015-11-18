import javax.xml.ws.RespectBindingFeature;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.soap.AddressingFeature;

import com.sheerimagination.businessobject.fulfillment.fsi.orders.api.IOrdersContract;
import com.sheerimagination.businessobject.fulfillment.fsi.orders.api.ObjectFactory;
import com.sheerimagination.businessobject.fulfillment.fsi.orders.api.OrderRequest;
import com.sheerimagination.businessobject.fulfillment.fsi.orders.api.Orders;
import com.sheerimagination.businessobject.fulfillment.fsi.orders.api.Request;
	

public class FSIClient {

	private final WebServiceFeature[] features = { new RespectBindingFeature(),
			new AddressingFeature(true) };
	private ObjectFactory factory = new ObjectFactory();

	/**
	 * Constructor
	 */
	public FSIClient() {
		System.setProperty(
				"com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump",
				"true");
		System.setProperty(
				"com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump",
				"true");
		System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump",
				"true");
		System.setProperty(
				"com.sun.xml.internal.ws.transport.http.HttpAdapter.dump",
				"true");
	}

	/**
	 * execute method
	 */
	private void execute() {
		ObjectFactory factory = new ObjectFactory();
		IOrdersContract contract = getOrdersContract();
		OrderRequest orerRequest = new OrderRequest();
		Request request = new Request();
		request.setAuthenticationKey(factory.createString("D29D22D7-0C87-4E55-8E0B-F4E5F0E0438C"));
		request.setOwnerCode(factory.createString("VU"));
		orerRequest.setOrder(factory.createRequest(request));
		contract.processOrder(orerRequest);
	}
	
	
	protected IOrdersContract getOrdersContract() {
		final WebServiceFeature[] features = { new RespectBindingFeature(),
				new AddressingFeature(true) };

		Orders service = new Orders();
		IOrdersContract contract = service.getPort(IOrdersContract.class,
				features);
		return contract;
	}

	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		FSIClient client = new FSIClient();
		client.execute();
	}
}
