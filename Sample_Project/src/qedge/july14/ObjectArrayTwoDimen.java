package qedge.july14;

public class ObjectArrayTwoDimen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object vararray[][]=new Object[5][2];
		vararray[0][0]= "Admin1";
		vararray[0][1]= 4567;
		vararray[1][0]= "Admin2";
		vararray[1][1]= "Emami#12467";
		vararray[2][0]= "Admin3";
		vararray[2][1]= "ghjk";
		vararray[3][0]= "Admin4";
		vararray[3][1]= 567.89f;
		vararray[4][0]= "Admin5";
		vararray[4][1]= 7657668;
		System.out.println("Row length is "+vararray.length);
		System.out.println("Cell length is "+vararray[0].length);
		System.out.println("Table data given below:");
		for (int i = 0; i < vararray.length; i++) {
			for (int j = 0; j < vararray[i].length; j++) {
				System.out.print(vararray[i][j]+"\t");
			}
			System.out.println("");
		}
	}

}
