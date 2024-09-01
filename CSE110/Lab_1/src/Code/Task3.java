package Code;
/*
Write a program that reads the radius of a circle and prints its circumference and area.
*/
import java.util.Scanner;
public class Task3 {
	public static void main(String [] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your radius");
		double r=scan.nextDouble();
		
		double c=2*3.1416*r;
		double area=3.1416*(r*r);
		System.out.println(c);
		System.out.println(area);
	}
}
