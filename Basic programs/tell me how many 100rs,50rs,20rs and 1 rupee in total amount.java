import java.util.Scanner;
//total amount = 1330
//tell me how many 100rs,50rs,20rs and 1rs notes you need for this amount.

public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int amt = input.nextInt();
	    while(amt!=0)
	    {
	        if(amt>100)
	        {
	            int res1=amt/100;
	            System.out.println("100rs is:"+" "+res1);
	            amt=amt-res1*100;
	            
	        }
	        else if(amt>50)
	        {
	            int res1=amt/50;
	            System.out.println("50 rs is:"+" "+res1);
	            amt=amt-res1*50;
	        }
	        else if(amt>20)
	        {
	            int res1=amt/20;
	            System.out.println("20 rs is:"+" "+res1);
	            amt=amt-res1*20;
	        }
	        else{
	            int res1=amt/1;
	            System.out.println("1 rs is:"+" "+res1);
	            amt=amt-res1*1;
	            
	        }
	        
	    }
	
	}
}
