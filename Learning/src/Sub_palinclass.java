import java.util.*;
public class Sub_palinclass extends Base_RevClass{
	void palin(int a) {
		int c=0;
		while(a>0) {
			int r=a%10;
			c=c*10+r;
			a/=10;
		}
		System.out.println(c);
	}
	public static void main(String[] args) {
		Sub_palinclass ob=new Sub_palinclass();
		Scanner obj=new Scanner(System.in);
		String a=obj.nextLine();
		int b=obj.nextInt();
		ob.rev(a);
		ob.rev(b);
		obj.close();

	}

}
