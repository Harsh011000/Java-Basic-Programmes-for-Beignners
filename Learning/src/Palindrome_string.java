import java.util.*;
public class Palindrome_string {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String a=obj.next();
		String b="";
		for (int i=a.length()-1;i>=0;--i) {
			b+=a.charAt(i);
		}
		if (a.equals(b)) {
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("No");
		}
		obj.close();

	}

}
