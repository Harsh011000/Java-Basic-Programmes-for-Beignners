import java.util.*;
public class matrix_rowsum {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int r=obj.nextInt();
		int c=obj.nextInt();
		int e[][]=new int[r][c];
		for (int i=0;i<r;++i) {
			for (int u=0;u<c;++u) {
				e[i][u]=obj.nextInt();
			}
		}
		int e2[]=new int[r];
		int z=0;
		for (int t[]:e) {
			int s=0;
			for (int i:t) {
				s+=i;
			}
			e2[z]=s;
			++z;
		}
		for (int t:e2) {
			System.out.println(t);
		}
		obj.close();

	}

}
