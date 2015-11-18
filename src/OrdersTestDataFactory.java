import com.sheerimagination.businessobject.fulfillment.fsi.orders.api.*;

import java.math.BigDecimal;

public class OrdersTestDataFactory {

    private ObjectFactory factory = new ObjectFactory();

    public OrderRequest createTestOrderRequest() {
        Request request = factory.createRequest();
        request.setAuthenticationKey(factory.createRequestAuthenticationKey("D29D22D7-0C87-4E55-8E0B-F4E5F0E0438C"));
        request.setOwnerCode(factory.createRequestOwnerCode("VU"));
        request.setBillingAddress(factory.createRequestBillingAddress(createTestAddress()));
        request.setShippingAddress(factory.createRequestShippingAddress(createTestAddress()));
        request.setLineItems(factory.createRequestLineItems(createTestLineItemCollection()));
        request.setOrderPayment(factory.createRequestOrderPayment(createTestPayment()));
        request.setShippingCode(ShippingMethod.FEP);
        request.setOrderNumber(factory.createRequestOrderNumber("TEST_ORDER_1"));
        request.setOrderDate(factory.createRequestOrderDate("11/18/2015"));
        request.setEmail(factory.createRequestEmail("test@test.it"));
        OrderRequest orderRequest = factory.createOrderRequest();
        orderRequest.setOrder(factory.createOrderRequestOrder(request));
        return orderRequest;
    }

    public Payment createTestPayment() {
        Payment payment = factory.createPayment();
        payment.setAmount(new BigDecimal("150"));
        payment.setMethod(PaymentMethod.NO_CHARGE);
        return payment;
    }

    public LineItemCollection createTestLineItemCollection() {
        LineItemCollection collection = factory.createLineItemCollection();
        LineItem item1 = factory.createLineItem();
        item1.setQuantity(1);
        item1.setItemNumber(factory.createLineItemItemNumber("TEST1"));
        item1.setPrice(new BigDecimal("150"));
        collection.getLineItem().add(item1);
        return collection;
    }

    public Address createTestAddress() {
        Address address = factory.createAddress();
        address.setName(factory.createAddressName("Default address name"));
        address.setAddress1(factory.createAddressAddress1("Address line 1"));
        address.setCity(factory.createAddressCity("New York"));
        address.setState(factory.createAddressState("NY"));
        address.setPostalCode(factory.createAddressPostalCode("30168"));
        address.setCountryCode(factory.createAddressCountryCode("USA"));
        return address;
    }

    public StatusRequest createTestStatusRequest() {
        StatusRequest statusRequest = factory.createStatusRequest();

        ServiceStatusRequest serviceStatusRequest = factory.createServiceStatusRequest();
        serviceStatusRequest.setAuthenticationKey(factory.createServiceStatusRequestAuthenticationKey("D29D22D7-0C87-4E55-8E0B-F4E5F0E0438C"));
        serviceStatusRequest.setOwnerCode(factory.createServiceStatusRequestOwnerCode("VU"));
        statusRequest.setStatus(factory.createStatusRequestStatus(serviceStatusRequest));

        return statusRequest;
    }
}
