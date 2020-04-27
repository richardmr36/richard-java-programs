package com.myprograms.jaxb;

import java.io.File;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;

import com.myprograms.jaxb.generated.AddressType;
import com.myprograms.jaxb.generated.Customer;

public class UnmarshalDemo {
    public static void main(String[] args) throws Exception {
        JAXBContext jc = JAXBContext.newInstance("com.myprograms.test.jaxb");
        Unmarshaller unmarshaller = jc.createUnmarshaller();

        // Unmarshal Customer
        File customerXML = new File("src/main/resources/samplexml/customer.xml");
        Customer customer = (Customer) unmarshaller.unmarshal(customerXML);
        System.out.println(customer);

        // Unmarshal Shipping Address
        String shippingXML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<shipping-address xmlns=\"http://www.example.org/customer\">\n" +
                "    <street>2 Another Road</street>\n" +
                "</shipping-address>\n";

        final StringReader reader = new StringReader(shippingXML);
        JAXBElement<AddressType> je = (JAXBElement<AddressType>) unmarshaller.unmarshal(reader);
        AddressType shipping = je.getValue();
        System.out.println(shipping);
    }
}
