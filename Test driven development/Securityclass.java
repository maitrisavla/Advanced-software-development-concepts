//package Assignment;


public class Securityclass implements security {
    public boolean IsDealerAuthorized(String dealerid, String dealeraccesskey) {
        if (dealerid.equals("XXX-1234-ABCD-1234") && dealeraccesskey.equals("kkklas8882kk23nllfjj88290")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean ItemValidate(String partnumber, String quantity) {
        if (partnumber.equals("1234") && quantity.equals("2")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean DeliveryAddressValidate(String name, String street, String city, String province, String postalcode)
    {
        if (name.equals("Mrs. Jane Smith")) {
            if (street.equals("35 Streetname")) {
                if (city.equals("Halifax")) {
                    if (province.equals("NS")) {
                        if (postalcode.equals("B2T1A4")) {
                            return true;
                        }
                    }
                }
            }
        } else {
            return false;
        }
        return false;
    }
}



