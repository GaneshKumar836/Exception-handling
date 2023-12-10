import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
	  int a;
	  int b;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter a and b values:");
	  a=sc.nextInt();
	  b=sc.nextInt();
	  try
	  {
	  System.out.println(a/b);

	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }

}
}
