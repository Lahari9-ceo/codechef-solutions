import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c=sc.nextInt();
		    int x = Math.max(a,Math.max(b,c));
		    if(x==a)
		    System.out.println("ALICE");
		    else if(x==b)
		    System.out.println("BOB");
		    else
		    System.out.println("CHARLIE");
		}

	}
}
