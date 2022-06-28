package jsontest;
// Convert a JSON to a Map
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JsontoMap {
	public static void main(String[] args)
	{
	Gson gson= new Gson();
	String json = "{\"name\":\"John\", \"age\":33}";
	Map<String,Object> map = gson.fromJson(json, new TypeToken<Map<String,Object>>(){}.getType());
	map.forEach((x,y)-> System.out.println("key : " + x + " , value : " + y));


}
}
