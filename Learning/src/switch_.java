import java.util.Scanner;
public class switch_ {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter choice: ");
		int a=obj.nextInt();
		switch (a) {
		case 1:
			int r=obj.nextInt();
			System.out.println(3.14*r*r);
			break;
		case 2:
			int l=obj.nextInt();
			int b=obj.nextInt();
			System.out.println(l*b);
			break;
		case 3:
			int r_=obj.nextInt();
			System.out.println(2*3.14*r_);
			break;
		case 4:
			int l_=obj.nextInt();
			int b_=obj.nextInt();
			System.out.println(2*(l_+b_));
			break;
		}
		
		
		obj.close();

	}

}
