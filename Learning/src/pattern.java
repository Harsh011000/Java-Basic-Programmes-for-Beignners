import java.util.*;
public class pattern {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		for (int i=1;i<=n;++i) {
			for (int u=1;u<=i;++u) {
				System.out.print(u);
			}
			System.out.println();
		}
		obj.close();

	}

}
