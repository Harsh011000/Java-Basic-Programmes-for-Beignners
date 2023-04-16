import java.util.*;
class complex{
	private double r;
	private double i;
	Scanner obj=new Scanner(System.in);
	void input() {
		//Scanner obj=new Scanner(System.in);
		r=obj.nextInt();
		i=obj.nextInt();
		//obj.close();
	}
	void add(complex a,complex b) {
		r=(a.r+b.r);
		i=(a.i+b.i);
	}
	void sub(complex a,complex b) {
		r=a.r-b.r;
		i=a.i-b.i;
	}
	void mul(complex a,complex b) {
		r=(a.r*b.r)+(-(a.i*b.i));
		i=(a.r*b.i)+(a.i*b.r);
	}
	void div(complex a,complex b) {
		r=((a.r*b.r)+(a.i*b.i))/((b.r*b.r)+(b.i*b.i));
		i=((a.i*b.r)-(a.r*b.i))/((b.r*b.r)+(b.i*b.i));
		//System.out.println(i);
	}
	void display() {
		if (i>=0) {
			System.out.printf("%.0f+%.0fi\n",r,i);
		}
		else {
			System.out.printf("%.0f%.0fi\n",r,i);;
		}
	}
	void display2() {
		if (i>=0) {
			System.out.println(r+"+"+i+"i");
		}
		else {
			System.out.println(r+""+i+"i");;
		}
	}
}
public class complex_class {

	public static void main(String[] args) {
		complex ob1=new complex();
		complex ob2=new complex();
		ob1.input();
		ob2.input();
		System.out.println(ob1);
		/*complex ob3=new complex();
		ob3.add(ob1, ob2);
		ob3.display();
		ob3.sub(ob1, ob2);
		ob3.display();
		ob3.mul(ob1, ob2);
		ob3.display();
		ob3.div(ob1, ob2);
		ob3.display2();*/
	}

}
