import java.util.*;
public class power {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int b=obj.nextInt();
		//obj.close();
		int c=1;
		//int i;
		for (int i=1;i<=b;++i) {
			c*=a;
			System.out.println(c);
		}
		System.out.println(c);
		obj.close();
		System.out.println(1000000000*10);
	}

}
