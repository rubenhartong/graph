package classes;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Address {
	String street;
	String zip;
	String city;
	
	private Customer customer;
	
	public Address() {
	}
	
	public Address(String street, String zip, String city) {
		super();
		this.street = street;
		this.zip = zip;
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	@XmlElement
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZip() {
		return zip;
	}
	@XmlElement
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	@XmlElement
	public void setCity(String city) {
		this.city = city;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer){
		this.customer = customer;
	}
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", zip=" + zip + ", city=" + city + "] /n";
	}
	
	
	
	
}
