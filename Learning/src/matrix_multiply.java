import java.util.*;
public class matrix_multiply {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter length of 1st matrix: ");
		int r=obj.nextInt();
		int c=obj.nextInt();
		int e[][]=new int[r][c];
		for (int i=0;i<r;++i) {
			for (int u=0;u<c;++u) {
				e[i][u]=obj.nextInt();
			}
		}
		System.out.println("Enter length of 2nd matrix: ");
		int r2=obj.nextInt();
		int c2=obj.nextInt();
		int e2[][]=new int[r2][c2];
		for (int i=0;i<r2;++i) {
			for (int u=0;u<c2;++u) {
				e2[i][u]=obj.nextInt();
			}
		}
		
		if (c==r2) {
			int e3[][]=new int[r][c2];
			for (int i=0;i<r;++i) {
				for (int u=0;u<c2;++u) {
					int ts=0;
					for (int z=0;z<c;++z) {
						int tm=e[i][z]*e2[z][u];
						ts+=tm;
					}
					e3[i][u]=ts;
				}
			}
			System.out.println("Output Matrix");
			for (int t[]:e3) {
				for (int i:t) {
					System.out.print(i+" ");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Cannot Multiply");
		}
		obj.close();

	}

}
