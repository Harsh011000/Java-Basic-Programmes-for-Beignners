import java.util.*;
public class matrix_transpose {

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
		int t[][]=new int[c][r];
		for (int i=0;i<r;++i) {
			for (int u=0;u<c;++u) {
				t[u][i]=e[i][u];
			}
		}
		e=t;
		for (int tem[]:e) {
			for (int z:tem) {
				System.out.print(z+" ");
			}
			System.out.println();
		}
		obj.close();

	}

}
