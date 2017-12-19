import java.io.*;

public class w14_hw03_hw58 {
	public static void main(String arg[]) throws IOException {
		Shape shape[] = new Shape[10];
		for (int i=0; i<10; i++) {
			int type = (int)(Math.random()*3);
			switch (type) {
				case 0:
					shape[i] = new Circle();
					break;
				case 1:
					shape[i] = new Square();
					break;
				case 2:
					shape[i] = new Triangle();
					break;
			}
		}
		for (int i=0; i<10; i++) {
			shape[i].draw();
		}
	}
}
abstract class Shape {
	protected abstract void draw();
	protected abstract void erase();
}
class Circle extends Shape {
	public void draw() {
		System.out.println("我是一個圓形");
	}
	public void erase() {
		System.out.println("一個圓形被刪除!");
	}
}
class Square extends Shape {
	public void draw() {
		System.out.println("我是一個矩形");
	}
	public void erase() {
		System.out.println("一個矩形被刪除!");
	}
}
class Triangle extends Shape {
	public void draw() {
		System.out.println("我是一個三角形");
	}
	public void erase() {
		System.out.println("一個三角形被刪除!");
	}
}
