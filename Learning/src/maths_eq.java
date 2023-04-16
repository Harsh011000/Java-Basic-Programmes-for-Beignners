import java.util.*;
public class maths_eq {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int x=obj.nextInt();
		int n=obj.nextInt();
		obj.close();
		double ans=0;
		for (;n>=1;--n) {
			int nfac=1;
			for (int i=n;i>=1;--i) {
				nfac*=i;
			}
			ans+=(Math.pow(x,n))/nfac;
		}
		System.out.println(ans);
		//obj.close();

	}

}
