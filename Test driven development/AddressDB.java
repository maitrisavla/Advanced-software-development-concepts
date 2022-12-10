//package Assignment;

public class AddressDB implements IAddressDB{

    public void loadAddress(IAddress address)
    {
        address.setaddressname("Mrs. Jane Smith");
        address.setaddressstreet("35 Streetname");
        address.setaddresscity("Halifax");
        address.setaddressprovince("NS");
        address.setaddresspostalcode("B2T1A4");
    }
}
