package main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import classes.Customer;

public class JaxbMain2 {

	public static void main(String[] args) {

			try {
				File file = new File("customer_address_map.xml");
				JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				Customer customerIn = (Customer) jaxbUnmarshaller.unmarshal(file);
				System.out.println(customerIn);
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}	
}
