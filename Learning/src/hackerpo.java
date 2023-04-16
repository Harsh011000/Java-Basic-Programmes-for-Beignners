import java.util.*;
public class hackerpo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //int len=s1.length();
            //final int ws=15;
            String lenint=""+x;
            int dig=3-(lenint.length()); // no of 0 i want
            String z="0".repeat(dig)+lenint;
            System.out.printf("%-15s"+z+"\n",s1);
            
        }
        System.out.println("================================");
        sc.close();

	}

}
