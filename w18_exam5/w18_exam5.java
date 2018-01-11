import java.io.*;

public class w18_exam5 {
	public static void main(String arg[]) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		Person people[] = new Person[3];
		people[0] = new Muggle("評旻", 50);
		people[1] = new Kind_mage("郝髮施", 100);
		people[2] = new Wicked_mage("坏砝詩", 200);

		for (Person person:people) {
			person.show();
			if (person instanceof Kind_mage) {
				((Kind_mage)person).magic_atk();
				((Kind_mage)person).magic_def();
			} else if (person instanceof Wicked_mage) {
				((Wicked_mage)person).magic_atk();
				((Wicked_mage)person).magic_def();
			}
		}
	}
}
