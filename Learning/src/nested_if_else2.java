import java.util.Scanner;
public class nested_if_else2 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int x=obj.nextInt();
		int y=obj.nextInt();
		if (x>=0) {
			if (y>=0) {
				System.out.println("Lies in 1 quad");
			}
			else {
				System.out.println("lies in 4 quad");
			}
		}
		else {
			if (y<0) {
				System.out.println("Lies in 3 quad");
			}
			else {
				System.out.println("Lies in 2 quad");
			}
		}
		obj.close();

	}

}
