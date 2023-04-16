import java.util.*;
public class all_armstrong {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		for (int i=2;i<n;++i) {
			int l=(""+i).length();
			int ans=0;
			int t=i;
			while (t>0) {
				int r=t%10;
				ans+=(int)Math.pow(r,l);
				t/=10;
			}
			if (ans==i) {
				System.out.println(i);
			}
		}
		obj.close();

	}

}
