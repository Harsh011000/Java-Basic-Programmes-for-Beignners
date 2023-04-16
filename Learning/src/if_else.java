import java.util.Scanner;
public class if_else {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Age: ");
		int a=obj.nextInt();
		if (a>=18){
			System.out.println("He is eligible for voting");
		}
		else {
			System.out.println("Not eligible for voting");
		}
		obj.close();

	}

}
