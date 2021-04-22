import java.util.Scanner;

public class Quiz_2609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcdValue = gcd(a, b);
		int lcmValue = lcm(a, b, gcdValue);
		System.out.println(gcdValue);
		System.out.println(lcmValue);

	}

	public static int gcd(int a, int b) {
		if (b > a) {
			int temp = a;
			a = b;
			b = temp;
		}
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	public static int lcm(int a, int b, int gcdValue) {
		int lcmValue = a * b /gcdValue;;
		return lcmValue;
	}

}
