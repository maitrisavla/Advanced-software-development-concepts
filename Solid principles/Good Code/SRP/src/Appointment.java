import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Appointment {

    private String appID;
    private LocalDate appDate;

    HashMap<String, ArrayList<String>> appDetails = new HashMap<>();
    ArrayList<String> patientInfo = new ArrayList<>();

    public Appointment(String name, String phone, String appID)
    {
        this.patientInfo.add(name);
        this.patientInfo.add(phone);
    }
    public void bookApp()
    {
        String appID = "10001";
        LocalDate  appDate = LocalDate.now();
        patientInfo.add(String.valueOf(appDate));
        appDetails.put(appID,patientInfo);
    }
}
