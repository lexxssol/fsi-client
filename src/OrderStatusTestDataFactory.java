import com.sheerimagination.businessobject.fulfillment.fsi.orderstatus.api.*;

public class OrderStatusTestDataFactory {

    private ObjectFactory factory = new ObjectFactory();

    public OrderStatusRequest createTestOrderStatusRequest(int orderId) {
        OrderStatusRequest request = factory.createOrderStatusRequest();
        request.setAuthenticationKey("D29D22D7-0C87-4E55-8E0B-F4E5F0E0438C");
        request.setOwnerCode("VU");
        request.setOrderId(orderId);
        return request;
    }
}
