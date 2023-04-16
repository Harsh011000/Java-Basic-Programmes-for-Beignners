import java.util.*;
public class all_palindrome {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		for (int i=10;i<n;++i) {
			int t=i;
			int ans=0;
			while (t>0) {
				int r=t%10;
				ans=(ans*10)+r;
				t/=10;
			}
			if (ans==i) {
				System.out.println(i);
			}
		}
		obj.close();

	}

}
