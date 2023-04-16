import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int ans=0;
		int dn=a;
		while (dn>0) {
			int r=dn%10;
			ans=(ans*10)+r;
			dn/=10;
			
		}
		if (a==ans) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		obj.close();

	}

}
