import java.util.Scanner;
public class if_else2 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int x=obj.nextInt();
		if (x>=0) {
			int y=(int) Math.pow(x, 2)+2*x-3;
			System.out.println(y);			
		}
		else {
			int y=(int) Math.pow(x, 2)-2*x-3;
			System.out.println(y);
		}
		obj.close();

	}

}
