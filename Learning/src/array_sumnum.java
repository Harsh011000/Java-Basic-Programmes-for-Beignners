import java.util.*;
public class array_sumnum {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int e[]=new int[a];
		for (int i=0;i<a;++i) {
			e[i]=obj.nextInt();
		}
		int g=e[0];
		for (int u:e) {
			if (u>g) {
				g=u;
			}
		}
		System.out.println(g);
		obj.close();

	}

}
