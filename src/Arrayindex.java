import java.util.Scanner;

public class Arrayindex {

	public static void main(String[] args) {
		int a[]=new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("enter array values:");
		
		for(i=0;i<8;i++)
		{
			a[i]=sc.nextInt();
		}
      System.out.println(a[i]);
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}

}
}
