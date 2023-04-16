import java.util.*;
public class count_alpha_digit {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String a=obj.nextLine();
		int d=0;
		int l=0;
		int s=0;
		for (int i=0;i<=a.length()-1;++i) {
			if (Character.isDigit(a.charAt(i))) {
				d+=1;
			}
			else if (Character.isLetter(a.charAt(i))) {
				l+=1;
			}
			else {
				s+=1;
			}
		}
		System.out.println(d+","+l+","+s);
		obj.close();

	}

}
