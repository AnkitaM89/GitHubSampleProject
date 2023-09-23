package JavaPrograms;

public class FirstClass {

	public static void main(String[] args) {
		String a[]= {"cat","dog","mouse","cat","pig","tiger","dog"};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equalsIgnoreCase(a[j]))
					System.out.println(a[j]);
			}
		}

	}

}
