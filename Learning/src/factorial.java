import java.util.*;
public class factorial {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		long a=obj.nextLong();
		obj.close();
		long ans=1;
		for(;a>=1;--a) {
			ans*=a;
			System.out.println(a);
		}
		System.out.println(ans);
		//obj.close();

	}

}
