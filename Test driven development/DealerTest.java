//package Assignment;

public class DealerTest {

    private Dealer createDefaultDealer()
    {
        DealerDBMock m = new DealerDBMock();
        Dealer d = new Dealer(m);
        return d;
    }

    public void getdealeridTest()
    {
        Dealer d = createDefaultDealer();
        //DealerDBMock m = new DealerDBMock();
        //Dealer d = new Dealer(m);
        d.setdealerid("XXX-1234-ABCD-1234");
        if(d.getdealerid().equals("XXX-1234-ABCD-1234"))
        {
            System.out.println("PASS - getdealeridTest");
        }
        else
        {
            System.out.println("FAIL - getdealeridTest");
        }
    }

    public void setdealeridTest()
    {
        Dealer d = createDefaultDealer();
        //DealerDBMock m = new DealerDBMock();
        //Dealer d = new Dealer(m);
        d.setdealerid("XXX-1234-ABCD-1234");
        if(d.getdealerid().equals("XXX-1234-ABCD-1234"))
        {
            System.out.println("PASS - setdealeridTest");
        }
        else
        {
            System.out.println("FAIL - setdealeridTest");
        }
    }

    public void getdealeraccesskeyTest()
    {
        Dealer d = createDefaultDealer();
        //DealerDBMock m = new DealerDBMock();
        //Dealer d = new Dealer(m);
        d.setdealeraccesskey("kkklas8882kk23nllfjj88290");
        if(d.getdealeraccesskey().equals("kkklas8882kk23nllfjj88290"))
        {
            System.out.println("PASS - getdealeraccesskeyTest");
        }
        else
        {
            System.out.println("FAIL - getdealeraccesskeyTest");
        }
    }

    public void setdealeraccesskeyTest(){
        Dealer d = createDefaultDealer();
        //DealerDBMock m = new DealerDBMock();
        //Dealer d = new Dealer(m);
        d.setdealeraccesskey("kkklas8882kk23nllfjj88290");
        if(d.getdealeraccesskey().equals("kkklas8882kk23nllfjj88290"))
        {
            System.out.println("PASS - setdealeraccesskeyTest");
        }
        else
        {
            System.out.println("FAIL - setdealeraccesskeyTest");
        }
    }

    public void getdealerauthorizedTest()
    {
        Dealer d = createDefaultDealer();
        //DealerDBMock m = new DealerDBMock();
        //Dealer d = new Dealer(m);
        d.setdealerid("XXX-1234-ABCD-1234");
        d.setdealeraccesskey("kkklas8882kk23nllfjj88290");
        if(d.getdealeraccesskey().equals("kkklas8882kk23nllfjj88290") && d.getdealerid().equals("XXX-1234-ABCD-1234"))
        {
            System.out.println("PASS - getdealerauthorizedTest");
        }
        else
        {
            System.out.println("FAIL - getdealerauthorizedTest");
        }
    }

    public void setdealerauthorizedTest(){
        Dealer d = createDefaultDealer();
        //DealerDBMock m = new DealerDBMock();
        //Dealer d = new Dealer(m);
        d.setdealerid("XXX-1234-ABCD-1234");
        d.setdealeraccesskey("kkklas8882kk23nllfjj88290");
        if(d.getdealeraccesskey().equals("kkklas8882kk23nllfjj88290") && d.getdealerid().equals("XXX-1234-ABCD-1234"))
        {
            System.out.println("PASS - setdealerauthorizedTest");
        }
        else
        {
            System.out.println("FAIL - setdealerauthorizedTest");
        }
    }

    public void getdealeridToNullTest()
    {
        Dealer d = createDefaultDealer();
        if(d.getdealerid()==null){
            System.out.println("PASS - getdealeridToNullTest");
        }
        else
        {
            System.out.println("FAIL - getdealeridToNullTest");
        }

    }

    public void setdealeridToNullTest(){
        Dealer d = createDefaultDealer();
        if(d.getdealerid()==null)
        {
            System.out.println("PASS - setdealeridToNullTest");
        }
        else
        {
            System.out.println("FAIL - setdealeridToNullTest");
        }
    }

    public void getdealeraccesskeyToNullTest()
    {
        Dealer d = createDefaultDealer();
        if(d.getdealeraccesskey()==null){
            System.out.println("PASS - getdealeraccesskeyToNullTest");
        }
        else
        {
            System.out.println("FAIL - getdealeraccesskeyToNullTest");
        }

    }

    public void setdealeraccesskeyToNullTest(){
        Dealer d = createDefaultDealer();
        if(d.getdealeraccesskey()==null)
        {
            System.out.println("PASS - setdealeraccesskeyToNullTest");
        }
        else
        {
            System.out.println("FAIL - setdealeraccesskeyToNullTest");
        }
    }

    public void getdealeridEmptyTest()
    {
        DealerDBMock db = new DealerDBMock();
        db.setdealeridEmpty();
        Dealer d =new Dealer(db);
        if(d.getdealerid()==""){
            System.out.println("PASS - getdealeridEmptyTest");
        }
        else
        {
            System.out.println("FAIL - getdealeridEmptyTest");
        }
    }

    public void setdealeridEmptyTest()
    {
        DealerDBMock db = new DealerDBMock();
        db.setdealeridEmpty();
        Dealer d =new Dealer(db);
        if(d.getdealerid()==""){
            System.out.println("PASS - setdealeridEmptyTest");
        }
        else
        {
            System.out.println("FAIL - setdealeridEmptyTest");
        }

    }

    public void getdealeraccesskeyEmptyTest()
    {
        DealerDBMock db = new DealerDBMock();
        db.setdealeraccesskeyEmpty();
        Dealer d =new Dealer(db);
        if(d.getdealeraccesskey()==""){
            System.out.println("PASS - getdealeraccesskeyEmptyTest");
        }
        else
        {
            System.out.println("FAIL - getdealeraccesskeyEmptyTest");
        }

    }

    public void setdealeraccesskeyEmptyTest()
    {
        DealerDBMock db = new DealerDBMock();
        db.setdealeraccesskeyEmpty();
        Dealer d =new Dealer(db);
        if(d.getdealeraccesskey()==""){
            System.out.println("PASS - setdealeraccesskeyEmptyTest");
        }
        else
        {
            System.out.println("FAIL - setdealeraccesskeyEmptyTest");
        }

    }



}
