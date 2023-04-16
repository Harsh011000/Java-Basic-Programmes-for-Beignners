import java.util.*;
public class nested_switch {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter marks: ");
		double a=obj.nextDouble();
		int b=(int)a/10;
		int r=(int)a%10;
		switch (b) {
		case 10:
			switch (r) {
			case 0:
				System.out.println("O+");
				break;
			default:
				System.out.println("Invalid Marks");
				break;
			}
			break;
		case 9:
			switch (r) {
			case 0:
				System.out.println("A");
				break;
			default:
				System.out.println("A+");
				break;
			}
			break;
		case 8:
			switch (r) {
			case 0:
				System.out.println("B+");
				break;
			default:
				System.out.println("A");
				break;
			}
			break;
		case 7:
			switch (r) {
			case 0:
				System.out.println("B");
				break;
			default:
				System.out.println("B+");
				break;
			}
			break;
		case 6:
			switch (r) {
			case 0:
				System.out.println("C+");
				break;
			default:
				System.out.println("B");
				break;
			}
			break;
		case 5:
			switch (r) {
			case 0:
				System.out.println("C");
				break;
			default:
				System.out.println("C+");
				break;
			}
			break;
		case 4:
			switch (r) {
			case 0:
				System.out.println("D+");
				break;
			default:
				System.out.println("C");
				break;
			}
			break;
		case 3:
			switch (r) {
			case 0:
				System.out.println("D");
				break;
			default:
				System.out.println("D+");
				break;
			}
			break;
		case 2:
			switch (r) {
			case 0:
				System.out.println("E+");
				break;
			default:
				System.out.println("D");
				break;
			}
			break;
		case 1:
			switch (r) {
			case 0:
				System.out.println("E");
				break;
			default:
				System.out.println("E+");
				break;
			}
			break;
		case 0:
			System.out.println("F");
			break;
		default:
			System.out.println("Invalid Marks");
			break;
		}
		obj.close();

	}

}
