import java.util.*;
public class fibonaci {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		if (n>2) {
			int a=0;
			int b=1;
			String ans="0,1";
			for (int i=1;i<=n-2;++i) {
				int t=a+b;
				a=b;
				b=t;
				ans=ans+","+t;
			}
			System.out.println(ans);
		}
		else {
			switch(n) {
			case 1:
				System.out.println("0");
				break;
			case 2:
				System.out.println("0,1");
				break;
			}
		}
		obj.close();

	}

}
