package Code;
/*
write a program that reads two numbers from the user.
Your program should then print “first is greater” if the first number is greater, 
and “first is not greater” otherwise.
*/
import java.util.Scanner;
public class Task5 {
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your 1st number");
		int num1=scan.nextInt();
		
		System.out.println("Enter your 2nd number");
		int num2=scan.nextInt();
		
		if(num1>num2)
			System.out.println("First is greater");
		else
			System.out.println("First is not greater");
		
	}
}
