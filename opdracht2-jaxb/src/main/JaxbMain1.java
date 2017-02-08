package main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import classes.Address;
import classes.Customer;

public class JaxbMain1 {

	public static void main(String[] args) {
		  Address billingAdres = new Address("kerkstraat 1", "1261ZL", "Blaricum"); 
		  Address schippingAdres = new Address("torenlaan 11", "1261ZM", "Blaricum"); 
		  
		  Customer customer1 = new Customer();
		  customer1.setName("Ruben Hartong");
		  customer1.setDateOfBirth("05-06-1990");
		  
		    customer1.getAddressMap().put("billing", billingAdres);
	        customer1.getAddressMap().put("shipping", schippingAdres);

		  try {

			File file = new File("customer_address_map.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(customer1, file);
			jaxbMarshaller.marshal(customer1, System.out);

		      } catch (JAXBException e) {
			e.printStackTrace();
		      }

		}
}
