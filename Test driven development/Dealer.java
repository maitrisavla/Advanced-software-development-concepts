//package Assignment;

public class Dealer implements IDealer{

    private String dealerid;
    private String dealeraccesskey;

    private boolean isNotEmptyOrNull(String s)
    {
        if (s == null || s == "")
        {
            return false;
        }
        return true;
    }

    public void setdealerid(String id)
    {
        dealerid = id;
    }

    public String getdealerid()
    {

        return dealerid;
    }

    public void setdealeraccesskey(String accesskey)
    {
        dealeraccesskey = accesskey;
    }

    public String getdealeraccesskey()
    {
        return dealeraccesskey;
    }

    public Dealer(AddressDBMock db)
    {
        dealerid = null;
        dealeraccesskey = null;
    }

    public Dealer(IDealerDB db)
    {
        db.loadDealer(this);
    }
}


