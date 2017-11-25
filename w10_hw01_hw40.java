import java.io.*;

public class w10_hw01_hw40 {
	public static void main(String[] args) throws IOException {
		Car car1 = new Car("AAA", -50, 1000, -50);
		Car car2 = new Car("BBB", 0, 3000, 200);
		Car car3 = new Car("CCC", 50, 6000, 1000);
		car1.showProfile();
		System.out.println();
		car2.showProfile();
		System.out.println();
		car3.showProfile();
		System.out.println();
	}
}
class Car {
	private String modelName;
	private int carLength, engCC, maxSpeed;
	Car(String modelName, int carLength, int engCC, int maxSpeed) {
		this.setModel(modelName);
		this.setCarlength(carLength);
		this.setEngCC(engCC);
		this.setMaxSpeed(maxSpeed);
	}
	public void setModel(String name) {
		this.modelName = name;
	}
	public void setCarlength(int length) {
		if (length > 0) {
			this.carLength = length;
		} else {
			this.carLength = 0;
		}
	}
	public void setEngCC(int engcc) {
		if (engcc >= 2000 && engcc <= 5000) {
			this.engCC = engcc;
		} else {
			this.engCC = 0;
		}
	}
	public void setMaxSpeed(int speed) {
		if (speed > 0 && speed < 400) {
			this.maxSpeed = speed;
		} else {
			this.maxSpeed = 0;
		}
	}
	public void showProfile() {
		System.out.println("車種："+this.modelName);
		System.out.println("車身長度："+this.carLength);
		System.out.println("汽缸 CC 數："+this.engCC);
		System.out.println("最高車速："+this.maxSpeed);
	}
}
