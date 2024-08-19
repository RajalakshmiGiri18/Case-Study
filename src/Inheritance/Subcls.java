package Inheritance;

public class Subcls extends SingleInh {
	int i=10,j=20,k=30;
	public void subc()
	{
		
		System.out.println("This is sub class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Subcls ss=new Subcls();
	  ss.baseres();
	  int res=ss.i+ss.j+ss.k;
	  System.out.println("The sum of sub class is "+res);
	  
	  
	  

	}

}
