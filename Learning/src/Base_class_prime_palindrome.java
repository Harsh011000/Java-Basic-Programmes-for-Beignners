
public class Base_class_prime_palindrome {
	boolean isPrime(int a) {
		int c=0;
		for (int i=2;i<a;++i) {
			if (a%i==0) {
				c+=1;
			}
		}
		if (c==0) {
			return true;
		}
		else {
			return false;
		}
	}
	boolean isPalindrome(int a) {
		if (a>=10) {
		int c=0;
		int n=a;
		while (n>0) {
			int r=n%10;
			c=c*10+r;
			n/=10;
		}
		if (c==a) {
			return true;
		}
		else {
			return false;
		}
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		

	}

}
