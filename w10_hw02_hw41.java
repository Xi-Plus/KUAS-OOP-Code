import java.io.*;

public class w10_hw02_hw41 {
	public static void main(String[] args) throws IOException {
		Car c1 = new Car();
		Car c2 = new Car("Ford");
		Car c3 = new Car("BMW", 468);
		Car c4 = new Car("Benz", 500, 50, 750);
		c1.showProfile();
		System.out.println();
		c2.showProfile();
		System.out.println();
		c3.showProfile();
		System.out.println();
		c4.showProfile();
		System.out.println();
	}
}
class Car {
	private String modelName;
	private int carLength, engCC, maxSpeed;
	Car() {
		this(null, 0, 0, 0);
	}
	Car(String modelName) {
		this(modelName, 0, 0, 0);
	}
	Car(String modelName, int carLength) {
		this(modelName, carLength, 0, 0);
	}
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
