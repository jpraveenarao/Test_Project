package jaxbtest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;

@XmlRootElement
public class Customer {
	
	private String name;
	private int age;
	private int id;
	
	public String getName() {
		return name;
	}

	@XmlElement // Maps java property to XML element
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	@XmlElement
	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	@XmlAttribute // maps java property to XML Attribute
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

}
