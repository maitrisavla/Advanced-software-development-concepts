//package Assignment;

public class AddressTest {

    private Address createDefaultAddress()
    {
        AddressDBMock m = new AddressDBMock();
        Address a = new Address(m);
        return a;
    }

    public void getaddressnameTest()
    {
        Address a = createDefaultAddress();
        //DealerDBMock m = new DealerDBMock();
        //Dealer d = new Dealer(m);
        a.setaddressname("Mrs. Jane Smith");
        if(a.getaddressname().equals("Mrs. Jane Smith"))
        {
            System.out.println("PASS - getaddressnameTest");
        }
        else
        {
            System.out.println("FAIL - getaddressnameTest");
        }
    }

    public void setaddressnameTest()
    {
        Address a = createDefaultAddress();
        //DealerDBMock m = new DealerDBMock();
        //Dealer d = new Dealer(m);
        a.setaddressname("Mrs. Jane Smith");
        if(a.getaddressname().equals("Mrs. Jane Smith"))
        {
            System.out.println("PASS - setaddressnameTest");
        }
        else
        {
            System.out.println("FAIL - setaddressnameTest");
        }
    }

    public void getaddressstreetTest()
    {
        Address a = createDefaultAddress();
        //DealerDBMock m = new DealerDBMock();
        //Dealer d = new Dealer(m);
        a.setaddressstreet("35 Streetname");
        if(a.getaddressstreet().equals("35 Streetname"))
        {
            System.out.println("PASS - getaddressstreetTest");
        }
        else
        {
            System.out.println("FAIL - getaddressstreetTest");
        }
    }

    public void setaddressstreetTest()
    {
        Address a = createDefaultAddress();
        //DealerDBMock m = new DealerDBMock();
        //Dealer d = new Dealer(m);
        a.setaddressstreet("35 Streetname");
        if(a.getaddressstreet().equals("35 Streetname"))
        {
            System.out.println("PASS - setaddressstreetTest");
        }
        else
        {
            System.out.println("FAIL - setaddressstreetTest");
        }
    }

    public void getaddresscityTest()
    {
        Address a = createDefaultAddress();
        //DealerDBMock m = new DealerDBMock();
        //Dealer d = new Dealer(m);
        a.setaddresscity("Halifax");
        if(a.getaddresscity().equals("Halifax"))
        {
            System.out.println("PASS - getaddresscityTest");
        }
        else
        {
            System.out.println("FAIL - getaddresscityTest");
        }
    }

    public void setaddresscityTest()
    {
        Address a = createDefaultAddress();
        //DealerDBMock m = new DealerDBMock();
        //Dealer d = new Dealer(m);
        a.setaddresscity("Halifax");
        if(a.getaddresscity().equals("Halifax"))
        {
            System.out.println("PASS - setaddresscityTest");
        }
        else
        {
            System.out.println("FAIL - setaddresscityTest");
        }
    }

    public void getaddressprovinceTest()
    {
        Address a = createDefaultAddress();
        //DealerDBMock m = new DealerDBMock();
        //Dealer d = new Dealer(m);
        a.setaddressprovince("NS");
        if(a.getaddressprovince().equals("NS"))
        {
            System.out.println("PASS - getaddressprovinceTest");
        }
        else
        {
            System.out.println("FAIL - getaddressprovinceTest");
        }
    }

    public void setaddressprovinceTest()
    {
        Address a = createDefaultAddress();
        //DealerDBMock m = new DealerDBMock();
        //Dealer d = new Dealer(m);
        a.setaddressprovince("NS");
        if(a.getaddressprovince().equals("NS"))
        {
            System.out.println("PASS - setaddressprovinceTest");
        }
        else
        {
            System.out.println("FAIL - setaddressprovinceTest");
        }
    }

    public void getaddresspostalcodeTest()
    {
        Address a = createDefaultAddress();
        //DealerDBMock m = new DealerDBMock();
        //Dealer d = new Dealer(m);
        a.setaddresspostalcode("B2T1A4");
        if(a.getaddresspostalcode().equals("B2T1A4"))
        {
            System.out.println("PASS - getaddresspostalcodeTest");
        }
        else
        {
            System.out.println("FAIL - getaddresspostalcodeTest");
        }
    }

    public void setaddresspostalcodeTest()
    {
        Address a = createDefaultAddress();
        //DealerDBMock m = new DealerDBMock();
        //Dealer d = new Dealer(m);
        a.setaddresspostalcode("B2T1A4");
        if(a.getaddresspostalcode().equals("B2T1A4"))
        {
            System.out.println("PASS - setaddresspostalcodeTest");
        }
        else
        {
            System.out.println("FAIL - setaddresspostalcodeTest");
        }
    }

    public void getaddressnameToNullTest()
    {
        Address a = createDefaultAddress();
        if(a.getaddressname()==null){
            System.out.println("PASS - getaddressnameToNullTest");
        }
        else
        {
            System.out.println("FAIL - getaddressnameToNullTest");
        }
    }
    public void setaddressnameToNullTest()
    {
        Address a = createDefaultAddress();
        if(a.getaddressname()==null){
            System.out.println("PASS - setaddressnameToNullTest");
        }
        else
        {
            System.out.println("FAIL - setaddressnameToNullTest");
        }
    }

    public void getaddressstreetToNullTest()
    {
        Address a = createDefaultAddress();
        if(a.getaddressstreet()==null){
            System.out.println("PASS - getaddressstreetToNullTest");
        }
        else
        {
            System.out.println("FAIL - getaddressstreetToNullTest");
        }
    }

    public void setaddressstreetToNullTest()
    {
        Address a = createDefaultAddress();
        if(a.getaddressstreet()==null){
            System.out.println("PASS - setaddressstreetToNullTest");
        }
        else
        {
            System.out.println("FAIL - setaddressstreetToNullTest");
        }
    }

    public void getaddresscityToNullTest()
    {
        Address a = createDefaultAddress();
        if(a.getaddresscity()==null){
            System.out.println("PASS - getaddresscityToNullTest");
        }
        else
        {
            System.out.println("FAIL - getaddresscityToNullTest");
        }
    }

    public void setaddresscityToNullTest()
    {
        Address a = createDefaultAddress();
        if(a.getaddresscity()==null){
            System.out.println("PASS - setaddresscityToNullTest");
        }
        else
        {
            System.out.println("FAIL - setaddresscityToNullTest");
        }
    }

    public void getaddressprovinceToNullTest()
    {
        Address a = createDefaultAddress();
        if(a.getaddressprovince()==null){
            System.out.println("PASS - getaddressprovinceToNullTest");
        }
        else
        {
            System.out.println("FAIL - getaddressprovinceToNullTest");
        }
    }

    public void setaddressprovinceToNullTest()
    {
        Address a = createDefaultAddress();
        if(a.getaddressprovince()==null){
            System.out.println("PASS - setaddressprovinceToNullTest");
        }
        else
        {
            System.out.println("FAIL - setaddressprovinceToNullTest");
        }
    }

    public void getaddresspostalcodeToNullTest()
    {
        Address a = createDefaultAddress();
        if(a.getaddresspostalcode()==null){
            System.out.println("PASS - getaddresspostalcodeToNullTest");
        }
        else
        {
            System.out.println("FAIL - getaddresspostalcodeToNullTest");
        }
    }

    public void setaddresspostalcodeToNullTest()
    {
        Address a = createDefaultAddress();
        if(a.getaddresspostalcode()==null){
            System.out.println("PASS - setaddresspostalcodeToNullTest");
        }
        else
        {
            System.out.println("FAIL - setaddresspostalcodeToNullTest");
        }
    }

    public void getaddressnameEmptyTest()
    {
        AddressDBMock db = new AddressDBMock();
        db.setaddressnameEmpty();
        Address a = new Address(db);
        if(a.getaddressname()==""){
            System.out.println("PASS - getaddressnameEmptyTest");
        }
        else
        {
            System.out.println("FAIL - getaddressnameEmptyTest");
        }
    }

    public void setaddressnameEmptyTest()
    {
        AddressDBMock db = new AddressDBMock();
        db.setaddressnameEmpty();
        Address a = new Address(db);
        if(a.getaddressname()==""){
            System.out.println("PASS - setaddressnameEmptyTest");
        }
        else
        {
            System.out.println("FAIL - setaddressnameEmptyTest");
        }
    }

    public void getaddressstreetEmptyTest()
    {
        AddressDBMock db = new AddressDBMock();
        db.setaddressstreetEmpty();
        Address a =new Address(db);
        if(a.getaddressstreet()==""){
            System.out.println("PASS - getaddressstreetEmptyTest");
        }
        else
        {
            System.out.println("FAIL - getaddressstreetEmptyTest");
        }
    }

    public void setaddressstreetEmptyTest()
    {
        AddressDBMock db = new AddressDBMock();
        db.setaddressstreetEmpty();
        Address a =new Address(db);
        if(a.getaddressstreet()==""){
            System.out.println("PASS - setaddressstreetEmptyTest");
        }
        else
        {
            System.out.println("FAIL - setaddressstreetEmptyTest");
        }
    }

    public void getaddresscityEmptyTest()
    {
        AddressDBMock db = new AddressDBMock();
        db.setaddresscityEmpty();
        Address a =new Address(db);
        if(a.getaddresscity()==""){
            System.out.println("PASS - getaddresscityEmptyTest");
        }
        else
        {
            System.out.println("FAIL - getaddresscityEmptyTest");
        }
    }

    public void setaddresscityEmptyTest()
    {
        AddressDBMock db = new AddressDBMock();
        db.setaddresscityEmpty();
        Address a =new Address(db);
        if(a.getaddresscity()==""){
            System.out.println("PASS - setaddresscityEmptyTest");
        }
        else
        {
            System.out.println("FAIL - setaddresscityEmptyTest");
        }
    }

    public void getaddressprovinceEmptyTest()
    {
        AddressDBMock db = new AddressDBMock();
        db.setaddressprovinceEmpty();
        Address a =new Address(db);
        if(a.getaddressprovince()==""){
            System.out.println("PASS - getaddressprovinceEmptyTest");
        }
        else
        {
            System.out.println("FAIL - getaddressprovinceEmptyTest");
        }
    }

    public void setaddressprovinceEmptyTest()
    {
        AddressDBMock db = new AddressDBMock();
        db.setaddressprovinceEmpty();
        Address a =new Address(db);
        if(a.getaddressprovince()==""){
            System.out.println("PASS - setaddressprovinceEmptyTest");
        }
        else
        {
            System.out.println("FAIL - setaddressprovinceEmptyTest");
        }
    }

    public void getaddresspostalcodeEmptyTest()
    {
        AddressDBMock db = new AddressDBMock();
        db.setaddresspostalcodeEmpty();
        Address a =new Address(db);
        if(a.getaddresspostalcode()==""){
            System.out.println("PASS - getaddresspostalcodeEmptyTest");
        }
        else
        {
            System.out.println("FAIL - getaddresspostalcodeEmptyTest");
        }
    }

    public void setaddresspostalcodeEmptyTest()
    {
        AddressDBMock db = new AddressDBMock();
        db.setaddresspostalcodeEmpty();
        Address a =new Address(db);
        if(a.getaddresspostalcode()==""){
            System.out.println("PASS - setaddresspostalcodeEmptyTest");
        }
        else
        {
            System.out.println("FAIL - setaddresspostalcodeEmptyTest");
        }
    }
}
