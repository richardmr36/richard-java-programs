package com.myprograms.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Unmarshaller;

import com.myprograms.jaxb.generated.AddressType;
import com.myprograms.jaxb.generated.Customer;

public class JAXBIntrospectorDemo {
    public static void main(String[] args) throws Exception {
        JAXBContext jc = JAXBContext.newInstance("com.myprograms.test.jaxb");
        Unmarshaller unmarshaller = jc.createUnmarshaller();

        // Unmarshal Customer
        File customerXML = new File("src/main/resources/samplexml/customer.xml");
        Customer customer = (Customer) JAXBIntrospector.getValue(unmarshaller
                .unmarshal(customerXML));

        // Unmarshal Shipping Address
        File shippingXML = new File("src/main/resources/samplexml/shipping.xml");
        AddressType shipping = (AddressType) JAXBIntrospector
                .getValue(unmarshaller.unmarshal(shippingXML));
    }
}
