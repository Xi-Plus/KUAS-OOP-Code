import java.io.*;

public class w17_hw03_hw68 {
	public static void main(String arg[]) {
		Animal transport[] = new Animal[3];
		transport[0] = new Puppy("PUPPY", "red");
		transport[1] = new Tiger("TIGER", "yellow");
		transport[2] = new Lion("LION", "blue");

		for (Animal temp:transport) {
			temp.show();
			if (temp instanceof Tiger) {
				((Tiger)temp).attack();
			} else if (temp instanceof Lion) {
				((Lion)temp).attack();
			}
			System.out.println();
		}
	}
}
