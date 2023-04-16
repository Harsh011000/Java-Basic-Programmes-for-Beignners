import java.util.*;
public class array_numcount {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int e[]=new int[a];
		for (int i=0;i<a;++i) {
			e[i]=obj.nextInt();
		}
		int b=obj.nextInt();
		int c=0;
		for (int u:e) {
			if (u==b) {
				++c;
			}
		}
		System.out.println(c);
		obj.close();

	}

}
