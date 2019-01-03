
//1476¹ø
import java.util.*;

public class Quiz_1476 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		int min = 0;
		boolean[] check = new boolean[n + 1];

		check[0] = check[1] = true;

		for (int i = 2; i * i <= n; i++) {
			if (check[i] == true) {
				continue;
			}
			for (int j = i + i; j <= n; j += i) {
				check[j] = true;
			}
		}
		for (int a = n; a > m; a--) {
			if (check[a] == false) {
				sum += a;
				min = a;
			}
		}

		if (sum == 0) {
			System.out.println("-1");
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
