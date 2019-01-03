import java.util.Arrays;
import java.util.Scanner;

public class Quiz_2309 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[9];
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}
		Arrays.sort(num);

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (sum - num[i] - num[j] == 100) {
					for (int a = 0; a < num.length; a++) {
						if (i == a || j == a) {
							continue;
						} else {
							System.out.println(num[a]);
						}
					}
					System.exit(0);
				}
			}
		}

	}

}
