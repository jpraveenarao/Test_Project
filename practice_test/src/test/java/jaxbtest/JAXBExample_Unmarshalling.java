package jaxbtest;

import java.io.File;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

//Unmarshalling – Convert XML content into a Java Object.

public class JAXBExample_Unmarshalling {

	public static void main(String[]args)
	{
		try
		{
					
		String basepath = System.getProperty("user.dir");
	
		File file= new File(basepath+"\\src\\test\\java\\jaxbtest\\Customer.xml");
		JAXBContext jaxbContext= JAXBContext.newInstance(Customer.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Customer customer=  (Customer)jaxbUnmarshaller.unmarshal(file);
		System.out.println(customer);
				
		
		}catch(JAXBException e) {
			e.printStackTrace();
			
		}
		
	}

}
