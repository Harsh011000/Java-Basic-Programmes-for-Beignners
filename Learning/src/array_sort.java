import java.util.*;
public class array_sort {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int e[]=new int[a];
		for (int i=0;i<a;++i) {
			e[i]=obj.nextInt();
		}
		for (int i=0;i<a;++i) {
			for (int u=i+1;u<a;++u) {
				if (e[i]>e[u]) {
					int t=0;
					t=e[i];
					e[i]=e[u];
					e[u]=t;
				}
				
			}
		}
		for (int z:e) {
			System.out.print(z+",");
		}
		obj.close();

	}

}
