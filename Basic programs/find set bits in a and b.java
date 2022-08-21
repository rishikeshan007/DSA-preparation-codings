import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int count=0;
		while(a!=0 && b!=0)
		{
		    count+=(a&1);
		    count+=(b&1);
		    a=a>>1;
		    b=b>>1;
		}
		System.out.println(count);
	}
}
