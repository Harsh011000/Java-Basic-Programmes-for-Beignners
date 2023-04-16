import java.util.*;
class matrix{
	private int r;
	private int c;
	private int e[][];
	Scanner obj=new Scanner(System.in);
	void input() {
		r=obj.nextInt();
		c=obj.nextInt();
		e=new int[r][c];
		for (int i=0;i<r;++i) {
			for (int u=0;u<c;++u) {
				e[i][u]=obj.nextInt();
			}
		}
	}
	void add(matrix a,matrix b) {
		e=new int[a.r][a.c];
		for (int i=0;i<a.r;++i) {
			for (int u=0;u<a.c;++u) {
				e[i][u]=a.e[i][u]+b.e[i][u];
			}
		}
	}
	void sub(matrix a,matrix b) {
		e=new int[a.r][a.c];
		for (int i=0;i<a.r;++i) {
			for (int u=0;u<a.c;++u) {
				e[i][u]=a.e[i][u]-b.e[i][u];
			}
		}
	}
	void trn() {
		//e=new int[a.r][a.c];
		int t[][]=new int[r][c];
		for (int i=0;i<r;++i) {
			for (int u=0;u<c;++u) {
				t[i][u]=e[u][i];
			}
		}
		e=t;
	}
	void mul(matrix a,matrix b) {
		//int t[][]=new int[a.r][b.c];
		e=new int[a.r][b.c];
		for (int i=0;i<a.r;++i) {
			for (int u=0;u<b.c;++u) {
				int tm=0;
				for (int z=0;z<a.c;++z) {
					tm+=a.e[i][z]*b.e[z][u];
				}
				e[i][u]=tm;
			}
			
		}
		//e=t;
	}
	void display() {
		for (int i[]:e) {
			for (int u:i) {
				System.out.print(u+" ");
			}
			System.out.println();
		}
	}
}
public class matrix_class {

	public static void main(String[] args) {
		matrix ob1=new matrix();
		matrix ob2=new matrix();
		ob1.input();
		ob2.input();
		matrix ob3=new matrix();
		ob3.add(ob1, ob2);
		ob3.display();
		
		ob3.sub(ob1, ob2);
		System.out.println("sub");
		ob3.display();
		
		ob3.mul(ob1, ob2);
		System.out.println("mul");
		ob3.display();
		
		ob1.trn();
		System.out.println("trn1");
		ob1.display();
		
		ob2.trn();
		System.out.println("trn2");
		ob2.display();
		
		

	}

}
