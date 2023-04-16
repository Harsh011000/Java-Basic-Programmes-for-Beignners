import java.util.Scanner;
public class ternary {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		//System.out.print("Enter l1x1: ");
		int l1_x1=obj.nextInt();
		int l1_y1=obj.nextInt();
		int l1_x2=obj.nextInt();
		int l1_y2=obj.nextInt();
		int len1=(int) Math.pow((Math.pow(l1_x2-l1_x1,2)+Math.pow(l1_y2-l1_y1,2)),0.5);
		int l2_x1=obj.nextInt();
		int l2_y1=obj.nextInt();
		int l2_x2=obj.nextInt();
		int l2_y2=obj.nextInt();
		int len2=(int) Math.pow((Math.pow(l2_x2-l2_x1,2)+Math.pow(l2_y2-l2_y1,2)),0.5);
		System.out.println(len1>len2 ? len1:len2);
		obj.close();

	}

}
