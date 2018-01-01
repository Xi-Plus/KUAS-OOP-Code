public class w16_hw04_hw64 {
	public static void main(String[] args) {
		Animal animal = new Horse();
		try {
			animal = (Bird) animal;
		} catch (ClassCastException e) {
			System.out.println("醒醒吧，馬不會飛唷。");
		}
	}
}
