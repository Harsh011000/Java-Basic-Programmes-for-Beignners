
public class Base_RevClass {
	void rev(int a) {
		int c=0;
		while(a>0) {
			int r=a%10;
			c=c*10+r;
			a/=10;
		}
		System.out.println(c);
	}
	void rev(String a) {
		String c="";
		for (int i=a.length()-1;i>=0;--i) {
			c+=a.charAt(i);
		}
		System.out.println(c);
	}
	public static void main(String[] args) {
		

	}

}
