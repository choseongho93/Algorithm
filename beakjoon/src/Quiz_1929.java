import java.util.Scanner;

public class Quiz_1929 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[] check = new boolean[m+1];
		check[0] = check[1] = true;
		for(int i=2; i*i<=m;i++) {//i*i를 i로도 가능하나, 예를들어 2*3은 이미 처리했으므로 3*2를 할필요가없기에 3*3부터실행함
			if(check[i]==true) {
				continue;
			}
			for(int j=i+i; j<=m; j=j+i) {
				check[j]=true;
			}
		}
		for( int i=n; i<=m; i++) {
			if(check[i]==false) {
				System.out.println(i);
			}
		}
	}

}
