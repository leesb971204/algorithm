import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int idx = 0;
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			if(arr[i] == idx) {
				idx++;
				cnt++;
			}
			if(idx == 3)
				idx = 0;
				
		}
		System.out.println(cnt);
		
		
		
	}
}
