import java.util.*;
public class array_smallest_2ndsmallest {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int e[]=new int[a];
		for (int i=0;i<a;++i) {
			e[i]=obj.nextInt();
		}
		int s=e[0];
		int s2=s+1;
		for (int u:e) {
			if (u<s) {
				s=u;
			}
		}
		for (int u2:e) {
			if (u2==s) {}
			else {
				if (u2<s2) {
					s2=u2;
				}}
			
		}
		System.out.println(+s+"\n"+s2);
		obj.close();

	}

}
