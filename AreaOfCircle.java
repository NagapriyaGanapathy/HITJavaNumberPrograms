package source.code;
import java.util.Scanner;
public class AreaOfCircle {
	static Scanner SC = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Radius:");
		double radius = SC.nextDouble();
		double area = Math.PI * (radius * radius);
		System.out.println("The area of circle is:"+area);
		double circumference=Math.PI * 2*radius;
		System.out.println("The circumference of the circle is "+circumference);
		 
		
	}

}
