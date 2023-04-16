import java.util.*;
public class matrix_comp_multi {
	static int r1r,c1r;
	static int e1r[][],e1i[][];
	static int r2r,c2r;
	static int e2r[][],e2i[][];
	void matrix_input() {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter dimension of 1st Matrix");
		r1r=obj.nextInt();
		c1r=obj.nextInt();
		e1r=new int[r1r][c1r];
		System.out.println("Enter real Matrix");
		for (int i=0;i<r1r;++i){
			for(int u=0;u<c1r;++u){
				e1r[i][u]=obj.nextInt();
			}
		}
		e1i=new int[r1r][c1r];
		System.out.println("Enter imag Matrix");
		for (int i=0;i<r1r;++i){
			for(int u=0;u<c1r;++u){
				e1i[i][u]=obj.nextInt();
			}
		}
		System.out.println("Enter dimension of 2nd Matrix");
		r2r=obj.nextInt();
		c2r=obj.nextInt();
		e2r=new int[r2r][c2r];
		System.out.println("Enter real Matrix");
		for (int i=0;i<r2r;++i){
			for(int u=0;u<c2r;++u){
				e2r[i][u]=obj.nextInt();
			}
		}
		e2i=new int[r2r][c2r];
		System.out.println("Enter imag Matrix");
		for (int i=0;i<r2r;++i){
			for(int u=0;u<c2r;++u){
				e2i[i][u]=obj.nextInt();
			}
		}
		obj.close();
		if (c1r!=r2r) {
			System.out.println("Multiplication Not Possible");
			System.exit(0);
		}
	}
	String [][] matrix_mulpy() {
		// real multiply e1r e2r
				int rr[][]=new int[r1r][c2r];
				for (int i=0;i<r1r;++i){
					for (int u=0;u<c2r;++u){
						int t=0;
						for (int z=0;z<c2r;++z){
							t+=e1r[i][z]*e2r[z][u];
						}
						rr[i][u]=t;
					}
				}
				// real to imag e1r e2i
				int ri[][]=new int[r1r][c2r];
				for (int i=0;i<r1r;++i){
					for (int u=0;u<c2r;++u){
						int t=0;
						for (int z=0;z<c2r;++z){
							t+=e1r[i][z]*e2i[z][u];
						}
						ri[i][u]=t;
					}
				}
				// imag to real e1i e2r
				int ir[][]=new int[r1r][c2r];
				for (int i=0;i<r1r;++i){
					for (int u=0;u<c2r;++u){
						int t=0;
						for (int z=0;z<c2r;++z){
							t+=e1i[i][z]*e2r[z][u];
						}
						ir[i][u]=t;
					}
				}
				// imag to imag e1i e2i
				int ii[][]=new int[r1r][c2r];
				for (int i=0;i<r1r;++i){
					for (int u=0;u<c2r;++u){
						int t=0;
						for (int z=0;z<c2r;++z){
							t+=e1i[i][z]*e2i[z][u];
						}
						ii[i][u]=-t;
					}
				}
				// addition
				int rrii[][]=new int[r1r][c2r];
				for (int i=0;i<r1r;++i) {
					for (int u=0;u<c2r;++u) {
						rrii[i][u]=rr[i][u]+ii[i][u];
					}
				}
				int riir[][]=new int[r1r][c2r];
				for (int i=0;i<r1r;++i) {
					for (int u=0;u<c2r;++u) {
						riir[i][u]=ri[i][u]+ir[i][u];
					}
				}
				String ecom[][]=new String[r1r][c2r];
				for (int i=0;i<r1r;++i) {
					for (int u=0;u<c2r;++u) {
						if (riir[i][u]>0) {
							ecom[i][u]=(""+rrii[i][u])+"+"+(""+riir[i][u])+"i";
						}
						else {
							ecom[i][u]=(""+rrii[i][u])+(""+riir[i][u])+"i";
						}
					}
				}
				return ecom;
	}
	void print_matrix(String e_0[][]) {
		System.out.println("Output Matrix");
		for (String m[]:e_0) {
			for (String n:m) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		matrix_comp_multi cobj=new matrix_comp_multi();
		cobj.matrix_input();
		String ans[][]=cobj.matrix_mulpy();
		cobj.print_matrix(ans);
	}
}