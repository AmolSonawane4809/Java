import java.util.InputMismatchException;
import java.util.Scanner;

public class trycatch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b,c  ;
		try {
			System.out.println("Enter a value");
			a = sc.nextInt();
			System.out.println("Enter a value");
			b = sc.nextInt();
			c=a/b;
			System.out.println(c);
		} catch (InputMismatchException e) {
		System.out.println("Enter only no..!!!");
		}
		catch (ArithmeticException e) {
			System.out.println("You can not divide any no by 0..!!!");

		}

	}

}
