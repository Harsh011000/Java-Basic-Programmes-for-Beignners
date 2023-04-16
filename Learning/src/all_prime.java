import java.util.*;
public class all_prime {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the range number: ");
		int n=obj.nextInt();
		for (int i=2;i<n;++i) {
			int f=0;
			for (int u=2;u<i;++u) {
				if (i%u==0) {
					++f;
				}
			}
			if (f==0) {
				System.out.println(i);
			}
		}
		obj.close();

	}

}
