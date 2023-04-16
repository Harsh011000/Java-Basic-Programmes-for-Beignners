import java.util.*;
public class Sub_class_prime_palindrome extends Base_class_prime_palindrome{

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt();
		int b=obj.nextInt();
		Sub_class_prime_palindrome ob=new Sub_class_prime_palindrome();
		for (int i=a;i<b;++i) {
			if(ob.isPrime(i)& ob.isPalindrome(i)) {
				System.out.println(i);
			}
		}
		obj.close();

	}

}
