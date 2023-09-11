package qedge.july14;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> cars = new ArrayList<String>();
cars.add("TATA");
cars.add("FORD");
cars.add("HYUNDAI");
cars.add("TOYOTA");
cars.add("MARUTHI");
cars.add("HONDA");
cars.add("KIA");
cars.add("SKODA");
System.out.println("Size of ArrayList cars is:"+cars.size());
System.out.println("Cars available:");
for (int i = 0; i < cars.size(); i++) {
	System.out.println(cars.get(i));
}
	}

}
