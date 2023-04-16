import java.util.*;
public class prime {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int i=2;
		int f=0;
		while (i<a) {
			if (a%i==0) {
				f+=1;
			}
			++i;
		}
		if (f==0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
		obj.close();

	}

}
