import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int cnt = 0;
		while(n >= 2 && m >= 1 && n+m >= 3+k) {
			n -= 2;
			m--;
			cnt++;
		}
		System.out.println(cnt);
	}
}
