package testing;

public class Countcharacter {

	public static void main(String[] args) {
		String string = "project";

		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ') {
				count++;

			}
			

		}
		System.out.println("The no of characters in a string:" + count);

	}
}
