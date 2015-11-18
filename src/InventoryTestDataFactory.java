import com.sheerimagination.businessobject.fulfillment.fsi.inventory.api.*;

public class InventoryTestDataFactory {

    private ObjectFactory factory = new ObjectFactory();

    public InventoryRequest createInventoryRequest() {
        InventoryRequest inventoryRequest = factory.createInventoryRequest();

        inventoryRequest.setOwnerCode("VU");
        inventoryRequest.setAuthenticationKey("D29D22D7-0C87-4E55-8E0B-F4E5F0E0438C");

        return inventoryRequest;
    }
}
