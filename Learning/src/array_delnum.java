import java.util.*;
public class array_delnum {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int p=obj.nextInt();
		int e[]=new int[a];
		int e2[]=new int[a-1];
		for (int i=0;i<a;++i) {
			e[i]=obj.nextInt();
		}
		for (int u=0,k=0;u<a;++u,++k) {
			if (u==p) {
				--k;
			}
			else {
				e2[k]=e[u];
			}
		}
		e=e2;
		for (int z:e) {
			System.out.print(z+",");
		}
		System.out.println();
		/*for (int z2:e2) {
			System.out.print(z2+",");
		}*/
		obj.close();

	}

}
