package MMTMethodOverride;

import java.util.Scanner;

public class MMTClass1 {
	public void fromCity()
	{
		System.out.println("Type the Source airport " );
		Scanner s=new Scanner(System.in);
		String src=s.nextLine();
		
	}
	public void ToCity()
	{
		System.out.println("Type the Desination airport " );
		Scanner s=new Scanner(System.in);
		String src=s.nextLine();		
	}
	public void SingleTrip()
	{
		System.out.println("Type any letter to see the price for single trip " );
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);	
		System.out.println("Click the URL to check price");
		
	}
	public void RoundTrip()
	{
		System.out.println("Type any letter to see the price for round trip " );
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);	
		System.out.println("Click the URL to check price");
		
	}
	public void MultiTrip()
	{
		System.out.println("Type any letter to see the price for multi trip " );
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);	
		System.out.println("Click the URL to check price");
		
	}
	

}
