import java.util.*;
public class string_loop {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String a=obj.next();
		for (int i=0;i<=a.length()-1;++i) {
			String c="";//+a.charAt(i);
			for (int u=0;u<=i;++u) {
				//String c=""+a.charAt(i);
				c=c+a.charAt(i);
			}
			String t=""+Character.toUpperCase(c.charAt(0));
			System.out.println(c.replaceFirst(""+c.charAt(0),t));
		}
		obj.close();

	}

}
