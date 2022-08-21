import java.util.Scanner;

public class Main
{
    public static boolean prime(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    
    
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
	    if(prime(n))
	    {
	        System.out.println(n+" "+" is a prime number");
	    }
	    else{
	        System.out.println(n+" "+" is not a prime number");
	    }
	    
	    
	}
}
