import javax.xml.ws.RespectBindingFeature;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.soap.AddressingFeature;

import com.sheerimagination.businessobject.fulfillment.fsi.inventory.api.Inventory;
import com.sheerimagination.businessobject.fulfillment.fsi.inventory.api.InventoryReply;
import com.sheerimagination.businessobject.fulfillment.fsi.inventory.api.InventoryRequest;
import com.sheerimagination.businessobject.fulfillment.fsi.inventory.api.InventorySoap;
import com.sheerimagination.businessobject.fulfillment.fsi.orders.api.*;
import com.sheerimagination.businessobject.fulfillment.fsi.orderstatus.api.OrderStatus;
import com.sheerimagination.businessobject.fulfillment.fsi.orderstatus.api.OrderStatusContract;
import com.sheerimagination.businessobject.fulfillment.fsi.orderstatus.api.OrderStatusReply;
import com.sheerimagination.businessobject.fulfillment.fsi.orderstatus.api.OrderStatusRequest;

public class FSIClient {

	/**
	 * processOrder method
	 */
	public OrderResponse processOrder(OrderRequest orderRequest) {
		IOrdersContract contract = getOrdersContract();
		return contract.processOrder(orderRequest);
	}

	/**
	 * getOrderStatus method
	 */
	public OrderStatusReply getOrderStatus(OrderStatusRequest statusRequest) {
		OrderStatusContract contract = getOrderStatusContract();
		return contract.getOrderStatus(statusRequest);
	}

	/**
	 * inventoryInquiry method
	 */
	public InventoryReply inventoryInquiry(InventoryRequest inventoryRequest) {
		InventorySoap contract = getInventoryContract();
		return contract.inventoryInquiry(inventoryRequest);
	}

	/**
	 * getServiceStatus method
	 */
	public StatusResponse getServiceStatus(StatusRequest statusRequest) {
		IOrdersContract contract = getOrdersContract();
		return contract.getServiceStatus(statusRequest);
	}

	private IOrdersContract getOrdersContract() {
		Orders service = new Orders();
		WebServiceFeature[] features = { new RespectBindingFeature(), new AddressingFeature(true) };
		return service.getPort(IOrdersContract.class, features);
	}

	private OrderStatusContract getOrderStatusContract() {
		OrderStatus service = new OrderStatus();
		WebServiceFeature[] features = { new RespectBindingFeature(), new AddressingFeature(true) };
		return service.getPort(OrderStatusContract.class, features);
	}

	private InventorySoap getInventoryContract() {
		Inventory service = new Inventory();
		WebServiceFeature[] features = { new RespectBindingFeature(), new AddressingFeature(true) };
		return service.getPort(InventorySoap.class, features);
	}
}
