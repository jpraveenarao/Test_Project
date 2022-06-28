package jsontest;
// JSON to ArryList using TypeToken
import java.util.List;
import com.google.gson.Gson;

import com.google.gson.reflect.TypeToken;

public class JsonArraytoList {
	public static void main(String[] args)
	{
		
		Gson gson = new Gson();
		String json = "[{\"name\":\"John\",\"age\":\"30\",\"position\":\"Developer\"}, {\"name\":\"laplap\"}]";
		List<Staff> list = gson.fromJson(json, new TypeToken<List<Staff>>(){}.getType());
		list.forEach(x -> System.out.println(x));		
		}
}
