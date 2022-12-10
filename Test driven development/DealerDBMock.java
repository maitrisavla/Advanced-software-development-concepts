//package Assignment;

public class DealerDBMock implements IDealerDB{
    private String did;
    private String daccesskey;

    public void UserDBMock()
    {

        setToDefault();
    }

    public void loadDealer(IDealer dealer)
    {
        dealer.setdealeraccesskey(daccesskey);
        dealer.setdealerid(did);
    }

    public void setToDefault()
    {
        did = "XXX-1234-ABCD-1234";
        daccesskey = "kkklas8882kk23nllfjj88290";
    }

    public void setdealeridToNull()
    {

        did = null;
    }

    public void setdealeridEmpty()
    {

        did = "";
    }

    public void setdealeraccesskeyToNull()
    {

        daccesskey = null;
    }

    public void setdealeraccesskeyEmpty()
    {
        daccesskey = "";
    }
}
