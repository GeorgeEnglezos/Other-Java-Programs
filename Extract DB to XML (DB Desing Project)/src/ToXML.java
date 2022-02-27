import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


public class ToXML {

    public static final String xmlFilePath = "ORDERS.xml";

    public static void extractToXML(ArrayList<Main.Orders> orderList){

        try {
            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

            Document document = documentBuilder.newDocument();

            // root element
            Element root = document.createElement("Orders");
            document.appendChild(root);

            for (Main.Orders O: orderList){

                // Customer element
                Element Order = document.createElement("Order");

                root.appendChild(Order);

                // set an attribute to customer element
                Attr attr = document.createAttribute("ORDER_ID");
                attr.setValue(String.valueOf(O.getORDER_ID()));
                Order.setAttributeNode(attr);

                //you can also use staff.setAttribute("id", "1") for this

                // name element
                Element Name = document.createElement("NAME");
                Name.appendChild(document.createTextNode(O.getName()));
                Order.appendChild(Name);

                // department elements
                Element CustomerID = document.createElement("CUSTOMER_ID");
                CustomerID.appendChild(document.createTextNode(String.valueOf(O.getCUSTOMER_ID())));
                Order.appendChild(CustomerID);

                // email element
                Element email = document.createElement("EMAIL");
                email.appendChild(document.createTextNode(O.getEMAIL()));
                Order.appendChild(email);

                // gender elements
                Element Gender = document.createElement("GENDER");
                Gender.appendChild(document.createTextNode(String.valueOf(O.getGender())));
                Order.appendChild(Gender);

                // birth date elements
                Element BIRTH_DATE = document.createElement("BIRTH_DATE");
                BIRTH_DATE.appendChild(document.createTextNode(String.valueOf(O.getBIRTH_DATE())));
                Order.appendChild(BIRTH_DATE);

                //marital element
                Element MARITAL_STATUS = document.createElement("MARITAL_STATUS");
                MARITAL_STATUS.appendChild(document.createTextNode(O.getMARITAL_STATUS()));
                Order.appendChild(MARITAL_STATUS);

                //marital element
                Element INCOME_LEVEL = document.createElement("INCOME_LEVEL");
                INCOME_LEVEL.appendChild(document.createTextNode(O.getINCOME_LEVEL()));
                Order.appendChild(INCOME_LEVEL);

                // Credit Limit elements
                Element CREDIT_LIMIT = document.createElement("CREDIT_LIMIT");
                CREDIT_LIMIT.appendChild(document.createTextNode(String.valueOf(O.getCREDIT_LIMIT())));
                Order.appendChild(CREDIT_LIMIT);

                //TOTAL_GAIN elements
                Element TOTAL_GAIN = document.createElement("TOTAL_GAIN");
                TOTAL_GAIN.appendChild(document.createTextNode(String.valueOf(O.getTOTAL_GAIN())));
                Order.appendChild(TOTAL_GAIN);

                //TOTAL_GAIN elements
                Element TOTAL_COST = document.createElement("TOTAL_COST");
                TOTAL_COST.appendChild(document.createTextNode(String.valueOf(O.getTOTAL_COST())));
                Order.appendChild(TOTAL_COST);

                //USER_CREATED elements
                Element USER_CREATED = document.createElement("USER_CREATED");
                USER_CREATED.appendChild(document.createTextNode(String.valueOf(O.getUSER_CREATED())));
                Order.appendChild(USER_CREATED);

                //DATE_CREATED elements
                Element DATE_CREATED = document.createElement("DATE_CREATED");
                DATE_CREATED.appendChild(document.createTextNode(String.valueOf(O.getDATE_CREATED())));
                Order.appendChild(DATE_CREATED);

                //USER_MODIFIED elements
                Element USER_MODIFIED = document.createElement("USER_MODIFIED");
                USER_MODIFIED.appendChild(document.createTextNode(String.valueOf(O.getUSER_MODIFIED())));
                Order.appendChild(USER_MODIFIED);

                //DATE_MODIFIED elements
                Element DATE_MODIFIED = document.createElement("DATE_MODIFIED");
                DATE_MODIFIED.appendChild(document.createTextNode(String.valueOf(O.getDATE_MODIFIED())));
                Order.appendChild(DATE_MODIFIED);



                // create the xml file
                    //transform the DOM Object to an XML File
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource domSource = new DOMSource(document);
                StreamResult streamResult = new StreamResult(new File(xmlFilePath));

                    // If you use
                    // StreamResult result = new StreamResult(System.out);
                    // the output will be pushed to the standard output ...
                    // You can use that for debugging

                transformer.transform(domSource, streamResult);
            }
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }
}