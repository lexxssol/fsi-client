import com.sheerimagination.businessobject.fulfillment.fsi.inventory.api.InventoryReply;
import com.sheerimagination.businessobject.fulfillment.fsi.orders.api.ObjectFactory;
import com.sheerimagination.businessobject.fulfillment.fsi.orders.api.OrderResponse;
import com.sheerimagination.businessobject.fulfillment.fsi.orders.api.StatusResponse;
import com.sheerimagination.businessobject.fulfillment.fsi.orderstatus.api.OrderStatusReply;

public class EntryPoint {

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        enableDebugDumps();

        FSIClient client = new FSIClient();

        OrdersTestDataFactory ordersFactory = new OrdersTestDataFactory();
        OrderStatusTestDataFactory orderStatusFactory = new OrderStatusTestDataFactory();
        InventoryTestDataFactory inventoryFactory = new InventoryTestDataFactory();


        OrderResponse orderResponse = client.processOrder(ordersFactory.createTestOrderRequest());

        int orderId = orderResponse.getResponse().getValue().getOrderId();

        OrderStatusReply orderStatusReply = client.getOrderStatus(orderStatusFactory.createTestOrderStatusRequest(orderId));

        StatusResponse statusResponse = client.getServiceStatus(ordersFactory.createTestStatusRequest());

        InventoryReply inventoryReply = client.inventoryInquiry(inventoryFactory.createInventoryRequest());
    }

    private static void enableDebugDumps() {
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
}
