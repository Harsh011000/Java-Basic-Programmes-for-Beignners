import java.util.*;
public class sub_class_pow_fac extends Base_class_pow_fac {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		sub_class_pow_fac ob=new sub_class_pow_fac();
		double x=obj.nextDouble();
		double n=obj.nextDouble();
		obj.close();
		double s=0;
		for (;n>=1;--n) {
			s+=ob.power(x, n)/ob.fact(n);
		}
		System.out.println(s);
		String e[]= {"hello"};
		Base_class_pow_fac.main(e);
	}

}
