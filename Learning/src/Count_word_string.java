import java.util.*;
public class Count_word_string {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String a=obj.nextLine();
		String b=obj.next();
		int i=a.indexOf(b);
		if (i!=-1) {
			int c=1;
			while (i!=-1) {
				i=a.indexOf(b,i+1);
				if (i!=-1) {
					c+=1;
				}
			}
			System.out.println(c);
		}
		else {
			System.out.println("0");
		}
		obj.close();

	}

}
