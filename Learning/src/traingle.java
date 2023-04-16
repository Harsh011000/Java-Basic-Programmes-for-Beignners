import java.util.Scanner;
public class traingle {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int b=obj.nextInt();
		int c=obj.nextInt();
		if (a+b+c==180) {
			System.out.println("Triangle is possible");
		}
		else {
			System.out.println("Triangle is not possible");
		}
		
		obj.close();

	}

}
