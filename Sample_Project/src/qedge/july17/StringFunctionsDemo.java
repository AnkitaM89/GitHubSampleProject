package qedge.july17;

public class StringFunctionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="iam learning java and selenium";
		System.out.println(str.length());

		//equals
		//equalsIgnoreCase
		String str1 ="Hello";
		String str2 ="india";
		String str3="HELLO";
		String str4 ="Hello";
		System.out.println("Equals method Demo:");
		System.out.println(str1.equals(str4));//true
		System.out.println(str1.equals(str3));//false
		System.out.println(str1.equalsIgnoreCase(str3));//true
		System.out.println(str1.equalsIgnoreCase(str2));//false

		//contains
		String strstr ="Iam willing to learn selenium";
		System.out.println("Contains method Demo:");
		System.out.println(strstr.contains("ing"));//true
		System.out.println(strstr.contains("iam"));//false
		System.out.println(strstr.contains("selenium"));//true
		System.out.println(strstr.contains(" "));//true

		//startsWith
		//endsWith
		String str11="Good Morning to All";
		System.out.println("Starts with and Ends with method Demo:");
		System.out.println(str11.startsWith("Good"));//true
		System.out.println(str11.startsWith("Go"));//true
		System.out.println(str11.startsWith("G"));//true
		System.out.println(str11.startsWith("ood"));//false
		System.out.println(str11.endsWith("ll"));//true
		System.out.println(str11.endsWith("all"));//false
		System.out.println(str11.endsWith("All"));//true

		//concat
		String st1 ="Abdul ";
		String st2 ="Kalam";
		System.out.println(st1.concat(st2));

		//replace
		String st4 ="Welcome into india";
		System.out.println(st4.replace("into", "to"));

		//split Example 1
		String st3 ="Welcome to very wonderful world";
		String x[] =st3.split("very");
		System.out.print(x[0]);
		System.out.println(x[1]);


		//split Example 2
		String dob ="20/12/1976";
		String xyz[]=dob.split("/");
		for (String each : xyz) {
			System.out.println(each);
		}  

		//split Example 3
		String com ="TATA@MAHINDRA@DELOITE@TCS@GOOGLE@AMAZON@TATACLIQ@INFOSYS";
		String x1[]=com.split("@");
		System.out.println(x1[7]);
		for (String each : x1) {
			System.out.println(each);
		}
		
		//charAt
				String str10 ="welcome to selenium";
				System.out.println(str10.charAt(5));
				System.out.println(str10.charAt(7));
				System.out.println(str10.charAt(10));
				System.out.println(str10.charAt(12));
		//indexOf
				String str12 ="welcome to selenium";
				System.out.println(str12.indexOf('w'));
				System.out.println(str12.indexOf('t'));
				System.out.println(str12.indexOf('e'));
				System.out.println(str12.indexOf('e')+2);


	}

}
