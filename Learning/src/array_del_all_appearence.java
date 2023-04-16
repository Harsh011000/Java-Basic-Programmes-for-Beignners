import java.util.*;
public class array_del_all_appearence {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter N no:");
		int a=obj.nextInt();
		int e[]=new int[a];
		for (int i=0;i<a;++i) {
			e[i]=obj.nextInt();
		}
		System.out.print("no to be deleted");
		int b=obj.nextInt();
		int c=0;
		for (int u:e) {
			if (u==b) {
				++c;
			}
		}
		int t[]=new int[a-c];
		for (int z=0,x=0;z<a;++z,++x) {
			if (e[z]!=b) {
				t[x]=e[z];
			}
			else {
				--x;
			}
		}
		e=t;
		for (int q:e) {
			System.out.print(q+",");
		}
		obj.close();

	}

}
