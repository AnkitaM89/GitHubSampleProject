package qedge.july13;

public class StringArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
		System.out.println(str.length);
		System.out.println(str[2]);
		int i = 0;
		for (String each : str) {
			System.out.println("Day "+(i+1)+" of the week is : "+ each);
			i++;
		}
	}

}
