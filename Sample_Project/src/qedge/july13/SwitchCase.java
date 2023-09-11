package qedge.july13;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter your course name:");
			String course = sc.next();
			switch(course.toUpperCase())
			{
			case "SELENIUM":
				System.out.println("Course available:"+course);
				break;
			case "MANUAL":
				System.out.println("Course available:"+course);
				break;
			case "PYTHON":
				System.out.println("Course available:"+course);
				break;
			case "JAVA":
				System.out.println("Course available:"+course);
				break;
			default:
				System.out.println("Course "+course+" unavailable");
				break;
			}
		}
		sc.close();

	}

}
