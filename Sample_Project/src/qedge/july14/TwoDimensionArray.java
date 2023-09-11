package qedge.july14;

public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[][]=new String[5][2];
		str[0][0]="Admin1";
		str[0][1]="Test1";
		str[1][0]="Admin2";
		str[1][1]="Test2";
		str[2][0]="Admin3";
		str[2][1]="Test3";
		str[3][0]="Admin4";
		str[3][1]="Test4";
		str[4][0]="Admin5";
		str[4][1]="Test5";
		System.out.println("There are "+str.length+" rows" );
		System.out.println("There are "+str[0].length+" cells");
		System.out.println("Table data given below:");
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.print(str[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
