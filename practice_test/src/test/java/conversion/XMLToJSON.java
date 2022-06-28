package conversion;
/* first add (JSON In Java » 20200518) dependncy to convert json to xml and xml to json
 * <dependency>
   <groupId>org.json</groupId>
   <artifactId>json</artifactId>
   <version>20200518</version>
</dependency>

 */
 
	import org.json.JSONObject;
	import org.json.XML;
	 
	public class XMLToJSON {
		public static void main(String...s){
			String xml_data = "<student><name>Neeraj Mishra</name><age>22</age></student>";
	 
			//converting xml to json
			JSONObject obj = XML.toJSONObject(xml_data);
			
			System.out.println(obj.toString());
		}
	}


