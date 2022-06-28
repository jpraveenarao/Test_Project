package conversion;

 /* first add require dependncy to convert json to xml and xml to json
  * <dependency>
    <groupId>org.json</groupId>
    <artifactId>json</artifactId>
    <version>20200518</version>
</dependency>

  */
	import org.json.JSONObject;
	import org.json.XML;
	 
	public class JSONToXML {
		public static void main(String...s){
			String json_data = "{\"student\":{\"name\":\"Neeraj Mishra\", \"age\":\"22\"}}";
			JSONObject obj = new JSONObject(json_data);
			
			//converting json to xml
			String xml_data = XML.toString(obj);
			
			System.out.println(xml_data);
		}
	}


