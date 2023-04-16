import java.util.*;
public class only_first_letter {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String a=obj.nextLine();
		int ti=0;
		for (int i=a.length()-1;i>=0;--i) {
			if (Character.isUpperCase(a.charAt(i))) {
				ti=i;
				break;
			}
		}
		for (int u=0;u<ti-1;++u) {
			char c=a.charAt(u);
			String tc=""+c;
			if (Character.isUpperCase(c)) {
				a=a.replaceFirst(tc,(tc+"."));
				++u;
				++ti;
				//System.out.println(a);
			}
			else {
				a=a.replaceFirst(tc,"");
				--u;
				--ti;
				//System.out.println(a);
			}
			
		}
		System.out.println(a);
		obj.close();

	}

}
