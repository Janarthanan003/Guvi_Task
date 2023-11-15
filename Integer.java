package integer;
import java.util.Scanner;
public class Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sum of a");
		int a =6;
		int a1 =sc.nextInt();
		System.out.println("Enter sum of b");
		int b =8;
		int b1 =sc.nextInt();
		System.out.println("Enter sum of c");
		int c=5;
		int c1 =sc.nextInt();
		System.out.println("Enter sum of d");
		int d=3;
		int d1 = sc.nextInt();
		if((a+b)>(c+d)) {
			System.out.println("Sum of a and b is greater than c and d");
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}
