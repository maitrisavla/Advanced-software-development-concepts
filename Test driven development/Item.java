//package Assignment;

public class Item implements IItem{

    private String itempartnumber;
    private String itemquantity;

    public Item() {

    }

    private boolean isNotEmptyOrNull(String s)
    {
        if (s == null || s == "")
        {
            return false;
        }
        return true;
    }

    public void setitempartnumber(String partnumber)
    {
        itempartnumber = partnumber;
    }

    public String getitempartnumber()
    {
        return itempartnumber;
    }

    public void setitemquantity(String quantity)
    {
        itemquantity = quantity;
    }

    public String getitemquantity()
    {
        return itemquantity;
    }

//    public Item(ItemDBMock m)
//    {
//        itempartnumber = null;
//        itemquantity = null;
//    }

    public Item(IItemDB db)
      {
          db.loaditem(this);
      }
}
