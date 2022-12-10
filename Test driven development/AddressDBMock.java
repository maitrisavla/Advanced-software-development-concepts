//package Assignment;

public class AddressDBMock implements IAddressDB{

    private String aname;
    private String astreet;
    private String acity;
    private String aprovince;
    private String apostalcode;

    public void AddressDBMock()
    {

        setToDefault();
    }

    public void loadAddress(IAddress address)
    {
        address.setaddressname(aname);
        address.setaddressstreet(astreet);
        address.setaddresscity(acity);
        address.setaddressprovince(aprovince);
        address.setaddresspostalcode(apostalcode);
    }

    public void setToDefault()
    {
        aname = "Mrs. Jane Smith";
        astreet = "35 Streetname";
        acity = "Halifax";
        aprovince = "NS";
        apostalcode = "B2T1A4";
    }

    public void setadrressnameToNull()
    {

        aname = null;
    }

    public void setaddressnameEmpty()
    {

        aname = "";
    }

    public void setadrressstreetToNull()
    {

        astreet = null;
    }

    public void setaddressstreetEmpty()
    {

        astreet = "";
    }

    public void setadrresscityToNull()
    {

        acity = null;
    }

    public void setaddresscityEmpty()
    {

        acity = "";
    }

    public void setadrressprovinceToNull()
    {

        aprovince = null;
    }

    public void setaddressprovinceEmpty()
    {

        aprovince = "";
    }

    public void setaddresspostalcodeToNull()
    {

        apostalcode = null;
    }

    public void setaddresspostalcodeEmpty()
    {

        apostalcode = "";
    }
}
