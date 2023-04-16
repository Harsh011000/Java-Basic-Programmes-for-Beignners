import java.util.Scanner;
public class armstrong {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		String t=""+a;
		int l=t.length();
		int ans=0;
		int dn=a;
		while (dn>0) {
			int r=dn%10;
			ans=ans+(int)Math.pow(r,l);
			dn/=10;
			
		}
		if (a==ans) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}
		obj.close();

	}

}
