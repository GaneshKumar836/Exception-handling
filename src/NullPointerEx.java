
public class NullPointerEx {

	public static void main(String[] args) {
	
		String s=null;
		try {
			
			System.out.println(s.toUpperCase());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
