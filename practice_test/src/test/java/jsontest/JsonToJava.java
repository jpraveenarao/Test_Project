package jsontest;
//read a JSON from a file and convert it back to a Java object.

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;

public class JsonToJava {
	public static void main(String[] args) {

        Gson gson = new Gson();

        try
        {
        	Reader reader = new FileReader("C:\\eclipse-workspace\\practice_test\\src\\test\\java\\jsontest\\Staff.json"); 

			// Convert JSON to Java Object
            Staff staff = gson.fromJson(reader, Staff.class);
            System.out.println(staff);

			// Convert JSON to JsonElement, and later to String
            /*JsonElement json = gson.fromJson(reader, JsonElement.class);
            String jsonInString = gson.toJson(json);
            System.out.println(jsonInString);*/

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

	


