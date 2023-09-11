package qedge.july13;

public class IntArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]=new int[5];
		x[0]=100;
		x[1]=200;
		x[2]=800;
		x[3]=300;
		x[4]=400;
		System.out.println(x.length);
		System.out.println("The third element of the array is:"+x[2]);
		for (int i : x) {
			System.out.println(i);
		}
	}

}
