import java.io.*;

public class w15_hw02_hw60 {
	public static void main(String arg[]) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		Telephone telephone = new Telephone(30, 50);
		Cellphone cellphone = new Cellphone(120, 40, 120);
		Tablet tablet = new Tablet(30, 20, 30);

		telephone.showMessage();
		cellphone.showMessage();
		tablet.showMessage();
	}
}
