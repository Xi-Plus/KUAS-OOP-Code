import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class w14_hw01_hw56 {
	public static void main(String arg[]) throws IOException {
		Basic_Employee employee = new Basic_Employee("王曉明", "男", "0912345678", "同德里 807, Kaohsiung City, Sanmin District", 3);
		managers manager = new managers("王小華", "男", "0911356678", "2877, Lane 55, Dahua Road, Niaosong District, Kaohsiung City, 833", 4);
		supervisors supervisor = new supervisors("王大明", "女", "0917896678", "2, Lane 15, Xiuwu Street, Sanmin District, Kaohsiung City, 807", 5);
		employee.show();
		System.out.println();
		manager.show();
		System.out.println();
		supervisor.show();
		System.out.println();
	}
}
