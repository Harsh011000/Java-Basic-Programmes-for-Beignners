import java.util.Scanner;
public class nested_if_else {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		if (a%5==0) {
			if (a%8==0) {
				System.out.println("Divisible by both");
			}
			else {
				System.out.println("Divisible by 5");
			}
		}
		else if (a%8==0) {
			System.out.println("Divisible by 8");
		}
		obj.close();

	}

}
