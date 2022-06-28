package jsontest;
//JSON stands for JavaScript Object Notation,
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JavaToJson {

	public static void main(String[] args) throws IOException {

		Staff staff = createDummyObject();

		// 1. Convert object to JSON string
		Gson gson = new Gson();
		String json = gson.toJson(staff);
		System.out.println(json);

		// 2. Convert object to JSON string and save into a file directly
		try {
			FileWriter writer = new FileWriter("C:\\eclipse-workspace\\practice_test\\src\\test\\java\\jsontest\\Staff.json");
          
			gson.toJson(staff, writer);
			writer.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private static Staff createDummyObject() {

		Staff staff = new Staff();

		staff.setName("Raj");
		staff.setAge(35);
		staff.setPosition("Founder");
		staff.setSalary(new BigDecimal("10000"));
		List<String> skills = new ArrayList<String>();
		skills.add("java");
		skills.add("python");
		skills.add("shell");
		staff.setSkills(skills);
		return staff;
	}
}
