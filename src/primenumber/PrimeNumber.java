package primenumber;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();
		        boolean isPrime = true;
		        sc.close();
		        if (num <= 1) {
		            isPrime = false;
		        } else {
		            for (int i = 2; i <= Math.sqrt(num); i++) {
		                if (num % i == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }
		        }
		        if (isPrime) {
		            System.out.println(num + " is a prime number.");
		        } else {
		            System.out.println(num + " is not a prime number.");
		        }
		    }
		}