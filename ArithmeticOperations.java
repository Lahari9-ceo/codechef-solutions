import java.util.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int a = sc.nextInt();
		int b = sc.nextInt();
		switch (ch){
		    case '+' : 
		          System.out.println(a+b);
		          break;
		    case '-' : 
		          System.out.println(a-b);
		          break;
		    case '*' : 
		          System.out.println(a*b);
		          break;
		    case '/' : 
		          if(b!=0){
		            System.out.println(a/b);
		          }
		          else{
		            System.out.println("Error: Division by zero is not allowed.");
		          }
		                 break;
		    case '%' : 
		                if(b!=0){
		                System.out.println(a%b);
		                }
		                else{
		                System.out.println("Error: Modulo by zero is not allowed.");
		                }
		                break;
		    default: 
		               System.out.println("Invalid operator! Please use one of the following: +, -, *, /, %");
		                
		    
		}

	}
}
