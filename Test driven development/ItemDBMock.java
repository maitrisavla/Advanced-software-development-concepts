//package Assignment;

public class ItemDBMock implements IItemDB{

    private String ipartnumber;
    private String iquantity;

    public void ItemDBMock()
    {

        setToDefault();
    }

    public void loaditem(IItem item)
    {
        item.setitempartnumber(ipartnumber);
        item.setitemquantity(iquantity);
    }

    public void setToDefault()
    {
        ipartnumber = "1234";
        iquantity = "2";
    }

    public void setitempartnumberToNull()
    {
        ipartnumber = null;
    }

    public void setitempartnumberEmpty()
    {
        ipartnumber = "";
    }

    public void setitemquantityToNull()
    {
        iquantity= null;
    }

    public void setitemquantityEmpty()
    {
        iquantity = "";
    }

//    @Override
//    public void loaditem(IItem item) {
//
//    }

//    @Override
//    public void loaditeam(Item item) {
//
//    }
}
