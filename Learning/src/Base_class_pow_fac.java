//import java.util.*;
public class Base_class_pow_fac {
	double power(double a,double b) {
		double c=Math.pow(a, b);
		return c;
	}
	double fact(double a) {
		int c=1;
		for (;a>=1;--a) {
			c*=a;
		}
		return c;
	}
	public static void main(String[] args) {
		System.out.println("hello");
		//Base_class_pow_fac ob=new Base_class_pow_fac();
		//System.out.println(ob.power(10,10000000));
	}

}
