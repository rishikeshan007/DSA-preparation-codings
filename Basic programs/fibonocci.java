import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
	    
	    int a=0;
	    int b=1;
	    System.out.print(a+" "+b+" ");
	   
	    for(int i=2;i<n;i++)
	    {
	        int c=a+b;
	        System.out.print(c+" ");
	        a=b;
	        b=c;
	    }
		
	}
}
