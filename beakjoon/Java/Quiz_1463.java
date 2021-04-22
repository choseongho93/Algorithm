import java.util.Scanner;

public class Quiz_1463 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n + 1];
		d[1] = 0;
		for (int i = 2; i <= n; i++) {
			d[i] = d[i - 1] + 1;
			System.out.println("-1일때 / d[i]: " + d[i] + " i: " + i);
			System.out.println("----------------------------------");

			if (i % 2 == 0 && d[i] > d[i / 2] + 1) {
				d[i] = d[i / 2] + 1;
			}
			System.out.println("%2일때 / d[i]: " + d[i] + " i: " + i);
			System.out.println("----------------------------------");
			if (i % 3 == 0 && d[i] > d[i / 3] + 1) {
				d[i] = d[i / 3] + 1;
			}
			System.out.println("%3일때 / d[i]: " + d[i] + " i: " + i);
			System.out.println("----------------------------------");
		}
		System.out.println(d[n]);
	}

}
//	public static int[] d;
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		d = new int[n + 1];
//		System.out.println(go(n));
//	}
//
//	public static int go(int n) {
//		System.out.println("처음값 : " + n);
//		System.out.println("d[n] 값 : " + d[n]);
//		if (n == 1) {
//			return 0;
//		}
//		if (d[n] > 0) {
//			return d[n];
//		}
//		d[n] = go(n - 1) + 1;
//		System.out.println(n + "번쨰: " + "여기: " + d[n]);
//		System.out.println("----여기넘어옴11----");
//		if (n % 2 == 0) {
//			int temp = go(n / 2) + 1;
//			if (d[n] > temp) {
//				d[n] = temp;
//			}
//		}
//		System.out.println("----여기넘어옴22----");
//		if (n % 3 == 0) {
//			int temp = go(n / 3) + 1;
//			if (d[n] > temp) {
//				d[n] = temp;
//			}
//		}
//		return d[n];
//	}
//
//}
