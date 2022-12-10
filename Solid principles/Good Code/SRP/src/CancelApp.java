public class CancelApp extends Appointment
{

    public CancelApp(String name, String phone, String appID)
    {
        super(name, phone, appID);
    };

    public void cancelApp(String appID){
        appDetails.remove(appID);
    }


}
