//package Assignment;

public class Address implements IAddress{

    private String addressname;
    private String addressstreet;
    private String addresscity;
    private String addressprovince;
    private String addresspostalcode;

    private boolean isNotEmptyOrNull(String s)
    {
        if (s == null || s == "")
        {
            return false;
        }
        return true;
    }

    public void setaddressname(String name)
    {
        addressname = name;
    }

    public String getaddressname()
    {

        return addressname;
    }

    public void setaddressstreet(String street)
    {
        addressstreet = street;
    }

    public String getaddressstreet()
    {

        return addressstreet;
    }

    public void setaddresscity(String city)
    {
        addresscity = city;
    }

    public String getaddresscity()
    {

        return addresscity;
    }

    public void setaddressprovince(String province)
    {
        addressprovince = province;
    }

    public String getaddressprovince()
    {

        return addressprovince;
    }

    public void setaddresspostalcode(String postalcode)
    {
        addresspostalcode = postalcode;
    }

    public String getaddresspostalcode()
    {

        return addresspostalcode;
    }

    public Address()
    {
        addressname = null;
        addressstreet = null;
        addresscity = null;
        addressprovince = null;
        addresspostalcode = null;
    }

    public Address(IAddressDB db)
    {
        db.loadAddress(this);
    }
}
