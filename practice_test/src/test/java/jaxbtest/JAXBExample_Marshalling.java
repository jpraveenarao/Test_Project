package jaxbtest;

import java.io.FileWriter;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

//JAXB, stands for Java Architecture for XML Binding, 
//Marshaling – Convert a Java object into a XML file
public class JAXBExample_Marshalling {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setName("Raj");
		customer.setAge(30);
		customer.setId(1234);

		try {

			FileWriter writer = new FileWriter(
					"C:\\eclipse-workspace\\practice_test\\src\\test\\java\\jaxbtest\\Customer.xml");

			// JAXBContext provides XML/java binding information.Here we obtaining
			// new instance of JAXBContext class
			
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);

			// Marshaller sends java content to XML data.
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// print output
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(customer, writer);

			jaxbMarshaller.marshal(customer, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}
}
