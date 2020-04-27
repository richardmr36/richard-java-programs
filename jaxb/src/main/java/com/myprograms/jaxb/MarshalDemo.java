package com.myprograms.jaxb;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;

import com.myprograms.jaxb.generated.AddressType;
import com.myprograms.jaxb.generated.Customer;
import com.myprograms.jaxb.generated.ObjectFactory;

public class MarshalDemo {
    public static void main(String[] args) throws Exception {
        JAXBContext jc = JAXBContext.newInstance("com.myprograms.test.jaxb");
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // Create Domain Objects
        AddressType billingAddress = new AddressType();
        billingAddress.setStreet("1 Any Street");
        Customer customer = new Customer();
        customer.setBillingAddress(billingAddress);

        // Marshal Customer
        marshaller.marshal(customer, System.out);

        final StringWriter writer = new StringWriter();
        marshaller.marshal(customer, writer);
        System.out.println(writer.toString());

        // Marshal Billing Address
        ObjectFactory objectFactory = new ObjectFactory();
        JAXBElement<AddressType> je =  objectFactory.createBillingAddress(billingAddress);
        marshaller.marshal(je, System.out);
    }
}
