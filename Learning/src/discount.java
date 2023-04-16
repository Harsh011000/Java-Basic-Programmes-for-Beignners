import java.util.*;
public class discount {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		final int b=99;
		if (a<19) {
			System.out.println("Discount: 20%\n"+(20.f/100)*b);
		}
		else if(a<50){
			System.out.println("Discount: 30%\n"+(30.f/100)*b);
		}
		else if(a<100) {
			System.out.println("Discount: 40%\n"+(40.f/100)*b);
		}
		else {
			System.out.println("Discount: 50%\n"+(50.f/100)*b);
		}
		obj.close();

	}

}
