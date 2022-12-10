//package Assignment;

public class ItemTest {

    private Item createDefaultItem()
    {
        ItemDBMock m = new ItemDBMock();
        Item i  = new Item(m);
        return i;
    }

    public void getitempartnumberTest()
    {
        Item i = createDefaultItem();
        i.setitempartnumber("1234");
        if(i.getitempartnumber().equals("1234"))
        {
            System.out.println("PASS - getitempartnumberTest ");
        }
        else
        {
            System.out.println("FAIL - getitempartnumberTest");
        }
    }

    public void setitempartnumberTest(){
        Item i=new Item();
        i.setitempartnumber("1234");
        if(i.getitempartnumber().equals("1234"))
        {
            System.out.println("PASS - setitempartnumberTest ");
        }
        else
        {
            System.out.println("FAIL - setitempartnumberTest");
        }
    }

    public void getitemquantityTest()
    {
        Item i = createDefaultItem();
        i.setitemquantity("2");
        if(i.getitemquantity().equals("2"))
        {
            System.out.println("PASS - getitemquantityTest ");
        }
        else
        {
            System.out.println("FAIL - getitemquantityTest");
        }
    }

    public void setitemquantityTest(){
        Item i = createDefaultItem();
        i.setitemquantity("2");
        if(i.getitemquantity().equals("2"))
        {
            System.out.println("PASS - setitemquantityTest ");
        }
        else
        {
            System.out.println("FAIL - setitemquantityTest");
        }
    }

    public void getitempartnumberToNullTest()
    {
        Item i = createDefaultItem();
        if(i.getitempartnumber()==null){
            System.out.println("PASS - getitempartnumberToNullTest");
        }
        else
        {
            System.out.println("FAIL - getitempartnumberToNullTest");
        }

    }

    public void setitempartnumberToNullTest()
    {
        Item i = createDefaultItem();
        if(i.getitempartnumber()==null){
            System.out.println("PASS - setitempartnumberToNullTest");
        }
        else
        {
            System.out.println("FAIL - setitempartnumberToNullTest");
        }

    }

    public void getitemquantityToNullTest()
    {
        Item i = createDefaultItem();
        if(i.getitemquantity()==null){
            System.out.println("PASS - getitemquantityToNullTest");
        }
        else
        {
            System.out.println("FAIL - getitemquantityToNullTest");
        }

    }

    public void setitemquantityToNullTest()
    {
        Item i = createDefaultItem();
        if(i.getitemquantity()==null){
            System.out.println("PASS - setitemquantityToNullTest");
        }
        else
        {
            System.out.println("FAIL - setitemquantityToNullTest");
        }

    }

    public void getitempartnumberEmptyTest()
    {
//        Item i = createDefaultItem();
        ItemDBMock db = new ItemDBMock();
        db.setitempartnumberEmpty();
        Item i =new Item(db);
        if(i.getitempartnumber()==""){
            System.out.println("PASS - getitempartnumberEmptyTest");
        }
        else
        {
            System.out.println("FAIL - getitempartnumberEmptyTest");
        }

    }

    public void setitempartnumberEmptyTest()
    {
//        Item i = createDefaultItem();
        ItemDBMock db = new ItemDBMock();
        db.setitempartnumberEmpty();
        Item i =new Item(db);
        if(i.getitempartnumber()==""){
            System.out.println("PASS - setitempartnumberEmptyTest");
        }
        else
        {
            System.out.println("FAIL - setitempartnumberEmptyTest");
        }

    }

    public void getitemquantityEmptyTest()
    {
        ItemDBMock db = new ItemDBMock();
        db.setitemquantityEmpty();
        Item i =new Item(db);
        if(i.getitemquantity()==""){
            System.out.println("PASS - getitemquantityEmptyTest");
        }
        else
        {
            System.out.println("FAIL - getitemquantityEmptyTest");
        }

    }

    public void setitemquantityEmptyTest()
    {
        ItemDBMock db = new ItemDBMock();
        db.setitemquantityEmpty();
        Item i =new Item(db);
        if(i.getitemquantity()==""){
            System.out.println("PASS - setitemquantityEmptyTest");
        }
        else
        {
            System.out.println("FAIL - setitemquantityEmptyTest");
        }

    }
}
