//package Assignment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

//package Assignment;

public class ValidateXML {

    public static void ParseXML(String filename) {
        try {
            /*
            Code reference taken for https://mkyong.com/java/how-to-read-xml-file-in-java-dom-parser/
            for XML reading and parsing.
             */
            File file = new File(filename);
            DocumentBuilderFactory docbfac = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docbfac.newDocumentBuilder();
            Document d = docBuilder.parse(file);
            d.getDocumentElement().normalize();
//            System.out.println("Root element :" + d.getDocumentElement().getNodeName());
//            NodeList nl = d.getElementsByTagName("order");
//            System.out.println("----------------------------");
            NodeList dealer = d.getElementsByTagName("dealer");
            for (int i = 0; i < dealer.getLength(); i++) {
                Node n = dealer.item(i);
//                System.out.println("\nCurrent NodeName: " + n.getNodeName());

                if (n.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) n;
                    String dealerId = e.getElementsByTagName("dealerid").item(0).getTextContent();
                    String dealerAccesskey = e.getElementsByTagName("dealeraccesskey").item(0).getTextContent();
                    Securityclass s = new Securityclass();
//                    System.out.println(dealerId);
//                    System.out.println(dealerAccesskey);
//                    System.out.println("DealerId: " + e.getElementsByTagName("dealerid").item(0).getTextContent());
//                    System.out.println("DealerAccessKey: " + e.getElementsByTagName("dealeraccesskey").item(0).getTextContent());
                    boolean result = s.IsDealerAuthorized(dealerId, dealerAccesskey);
//                    System.out.println(result);
                    if (result == true) {


                            System.out.println ("<order>\n" +
                                    "<result>Success - The Dealer is Authorized</result>\n" +
                                    "</order>");


                    } else {
                        System.out.println("<order>\n\t<result>failure</result>\n\t<error>Not authorized</error>\n</order>");
                    }
//                    System.out.println("DealerId: " + e.getElementsByTagName("dealerid").item(0).getTextContent());
//                    System.out.println("DealerAccessKey: " + e.getElementsByTagName("dealeraccesskey").item(0).getTextContent());
                }
            }

            NodeList items = d.getElementsByTagName("item");
            for (int i = 0; i < items.getLength(); i++) {
                ArrayList<String> al=new ArrayList<>();

                Node n2 = items.item(i);
//                System.out.println("\nCurrent NodeName: " + n.getNodeName());

                if (n2.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) n2;
                    String itemPartnumber = e.getElementsByTagName("partnumber").item(0).getTextContent();
                    String itemQuantity = e.getElementsByTagName("quantity").item(0).getTextContent();
//                    System.out.println("itemPartnumber: " + e.getElementsByTagName("partnumber").item(0).getTextContent());
//                    System.out.println("itemQuantity: " + e.getElementsByTagName("quantity").item(0).getTextContent());
                    Securityclass s = new Securityclass();
                    boolean result = s.ItemValidate(itemPartnumber, itemQuantity);
//                    System.out.println(result);
                    if (result == true)
                    {
                        System.out.println ("<order>\n" +
                                "<orderitems>\n" +
                                "<!-- An item in the list of items ordered by the dealer. -->\n" +
                                "<item>\n" + "<!-- The part number submitted to PARTMANAGER. -->\n" +
                                "<partnumber>1234</partnumber>\n" + "<!-- The quantity submitted to PARTMANAGER. -->\n" +
                                "<quantity>2</quantity>\n" + "<result>success</result>\n" + "</item>\n" + "</orderitems>");
                    }
                    else
                    {
                        System.out.println(" <order>\n" +
                                "<orderitems>\n" + "<item>\n" +
                                "<partnumber>5678</partnumber>\n" +
                                "<quantity>25</quantity>\n" +
                                "<result>failure</result>\n" +
                                "<errormessage>out of stock/no longer manufactured/invalid part</errormessage>\n" +
                                "</item>\n" + "</orderitems>\n" + "</order>");
                    }
                }
            }

            NodeList address = d.getElementsByTagName("deliveryaddress");
            for (int i = 0; i < address.getLength(); i++) {
                Node n1 = address.item(i);
//                System.out.println("\nCurrent NodeName: " + n.getNodeName());

                if (n1.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) n1;
                    String addressName = e.getElementsByTagName("name").item(0).getTextContent();
                    String addressStreet = e.getElementsByTagName("street").item(0).getTextContent();
                    String addressCity = e.getElementsByTagName("city").item(0).getTextContent();
                    String addressProvince = e.getElementsByTagName("province").item(0).getTextContent();
                    String addressPostalcode = e.getElementsByTagName("postalcode").item(0).getTextContent();

 //                   System.out.println("addressName: " + e.getElementsByTagName("name").item(0).getTextContent());
  //                  System.out.println("addressStreet: " + e.getElementsByTagName("street").item(0).getTextContent());
 //                   System.out.println("addressCity: " + e.getElementsByTagName("city").item(0).getTextContent());
 //                   System.out.println("addressProvince: " + e.getElementsByTagName("province").item(0).getTextContent());
  //                  System.out.println("addressPostalcode: " + e.getElementsByTagName("postalcode").item(0).getTextContent());

                    Securityclass s = new Securityclass();
                    boolean result = s.DeliveryAddressValidate(addressName, addressStreet, addressCity, addressProvince, addressPostalcode);
                    if (result == true)
                    {
                        System.out.println("<deliveryaddress>\n" +
                                "<!-- The name field can be blank. -->\n" +
                                "<name>Mrs. Jane Smith</name>\n" +
                                "<!-- The street is required. -->\n" +
                                "<street>35 Streetname</street>\n" +
                                "<!-- The city is required. -->\n" +
                                "<city>Halifax</city>\n" +
                                "<!-- The province is required. -->\n" +
                                "<province>NS</province>\n" +
                                "<!-- The postal code is required. -->\n" +
                                "<postalcode>B2T1A4</postalcode>\n" +
                                "</deliveryaddress>");
                    }
                    else{
                        System.out.println("<order>\n" +
                                "<result>failure</result>\n" +
                                "<error>Invalid order</error>\n" +
                                "<!-- Error message possible values are: -->\n" +
                                "<!-- Invalid delivery address -->\n" +
                                "<!-- Invlid order item list -->\n" +
                                "<!-- Invalid order item entry -->\n" +
                                "<errormessage>Invalid delivery address</errormessage>\n" +
                                "</order>");
                    }

                }
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

    }
}
