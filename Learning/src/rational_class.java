import java.util.*;
class rational{
	private int n;
	private int d;
	Scanner obj=new Scanner(System.in);
	void input(){
		n=obj.nextInt();
		d=obj.nextInt();
	}
	void display() {
		System.out.println(n+"/"+d);
	}
	int hcf() {
		int hcf=1;
		for (int i=n<d? n:d;i>=1;--i) {
			if (n%i==0 & d%i==0) {
				hcf=i;
				break;
			}
		}
		return hcf;
	}
	void add(rational a,rational b) {
		d=a.d*b.d;
		n=((d/a.d)*a.n)+((d/b.d)*b.n);
		int hcf=hcf();
		n=n/hcf;
		d=d/hcf;
	}
	void sub(rational a,rational b) {
		d=a.d*b.d;
		n=((d/a.d)*a.n)-((d/b.d)*b.n);
		int hcf=hcf();
		n=n/hcf;
		d=d/hcf;
	}
	void mul(rational a,rational b) {
		n=a.n*b.n;
		d=a.d*b.d;
		int hcf=hcf();
		n=n/hcf;
		d=d/hcf;
	}
	void div(rational a,rational b) {
		n=a.n*b.d;
		d=a.d*b.n;
		int hcf=hcf();
		n=n/hcf;
		d=d/hcf;
	}
}
public class rational_class {

	public static void main(String[] args) {
		rational ob1=new rational();
		rational ob2=new rational();
		ob1.input();
		System.out.println("hmm");
		ob2.input();
		rational ob3=new rational();
		ob3.add(ob1,ob2);
		ob3.display();
		ob3.sub(ob1,ob2);
		ob3.display();
		ob3.mul(ob1,ob2);
		ob3.display();
		ob3.div(ob1,ob2);
		ob3.display();
	}

}