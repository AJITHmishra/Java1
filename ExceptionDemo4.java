package ExceptionDemo1;

public class ExceptionDemo4 
{
	public static A a1;

	public static void main(String[] args) 
	{
		System.out.println("Main method start");
		
			int arr[]={10,20,30,40};
			System.out.println(arr[3]);
			System.out.println(a1);
			try
			{
				System.out.println(10/0);
			}
		
		catch(Exception e)
		{
			System.out.println("Exception e block-1 is invoking");
		}
		System.out.println("Done");

		System.out.println("Rajasrinivas");


		

	}

}
