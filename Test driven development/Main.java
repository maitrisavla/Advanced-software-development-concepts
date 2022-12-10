//package Assignment;

public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {

            DealerTest dealerTest = new DealerTest();
            ItemTest itemTest = new ItemTest();
            AddressTest addressTest = new AddressTest();

            dealerTest.getdealeridTest();
            dealerTest.setdealeridTest();
            dealerTest.getdealeraccesskeyTest();
            dealerTest.setdealeraccesskeyTest();
            dealerTest.getdealerauthorizedTest();
            dealerTest.setdealerauthorizedTest();
            dealerTest.getdealeraccesskeyToNullTest();
            dealerTest.setdealeraccesskeyToNullTest();
            dealerTest.getdealeridToNullTest();
            dealerTest.setdealeridToNullTest();
            dealerTest.getdealeraccesskeyEmptyTest();
            dealerTest.setdealeraccesskeyEmptyTest();
            dealerTest.getdealeridEmptyTest();
            dealerTest.setdealeridEmptyTest();
            System.out.println("..................");
            itemTest.getitempartnumberTest();
            itemTest.setitempartnumberTest();
            itemTest.getitemquantityTest();
            itemTest.setitemquantityTest();
            itemTest.getitempartnumberToNullTest();
            itemTest.setitempartnumberToNullTest();
            itemTest.getitemquantityToNullTest();
            itemTest.setitemquantityToNullTest();
            itemTest.getitempartnumberEmptyTest();
            itemTest.setitempartnumberEmptyTest();
            itemTest.getitemquantityEmptyTest();
            itemTest.setitemquantityEmptyTest();
            System.out.println("..................");
            addressTest.getaddressnameTest();
            addressTest.setaddressnameTest();
            addressTest.getaddressstreetTest();
            addressTest.setaddressstreetTest();
            addressTest.getaddresscityTest();
            addressTest.setaddresscityTest();
            addressTest.getaddressprovinceTest();
            addressTest.setaddressprovinceTest();
            addressTest.getaddresspostalcodeTest();
            addressTest.setaddresspostalcodeTest();
            addressTest.getaddressnameToNullTest();
            addressTest.setaddressnameToNullTest();
            addressTest.getaddressstreetToNullTest();
            addressTest.setaddressstreetToNullTest();
            addressTest.getaddresscityToNullTest();
            addressTest.setaddresscityToNullTest();
            addressTest.getaddressprovinceToNullTest();
            addressTest.setaddressprovinceToNullTest();
            addressTest.getaddresspostalcodeToNullTest();
            addressTest.setaddresspostalcodeToNullTest();
            addressTest.getaddressnameEmptyTest();
            addressTest.setaddressnameEmptyTest();
            addressTest.getaddressstreetEmptyTest();
            addressTest.setaddressstreetEmptyTest();
            addressTest.getaddresscityEmptyTest();
            addressTest.setaddresscityEmptyTest();
            addressTest.getaddressprovinceEmptyTest();
            addressTest.setaddressprovinceEmptyTest();
            addressTest.getaddresspostalcodeEmptyTest();
            addressTest.setaddresspostalcodeEmptyTest();
        } else {
            ValidateXML v = new ValidateXML();
            v.ParseXML(args[0]);
        }
    }

}
