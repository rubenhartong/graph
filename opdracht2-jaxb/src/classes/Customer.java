package classes;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import classes.Address;
 

@XmlRootElement
public class Customer {
	String name;
	String dateOfBirth;
	//List <Address> adres = new ArrayList<>();
	private Map<String, Address> addressMap = new HashMap<String, Address>();
	
	

	public Customer(String name, String dateOfBirth) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}
	

	public Customer() {
	}

	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}
	@XmlElement
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@XmlElement
	public Map<String, Address> getAddressMap() {
        return addressMap;
    }
	
	public void setAddressMap(Map<String, Address> addressMap) {
        this.addressMap = addressMap;
    }

	@Override
	public String toString() {
		return "Customer [name=" + name + ", dateOfBirth=" + dateOfBirth + ", adres=" + addressMap.toString() + "]";
	}
	
	

}