//import java.io.*;
import java.util.*;
//import java.math.BigInteger;

public class hasnext {
	//public static long b;
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        for (int i=1;i<=a;++i){
            //long b=obj.nextLong();
        	//long b;
            if (obj.hasNextLong()){
               long b=obj.nextLong();
                if (b>=-128 && b<=127){
                System.out.println("n can be fitted in:\n*byte\n*short\n*int\n*long");
               
                }
                else if (b>=-32768 && b<=32767){
                System.out.println("n can be fitted in:\n*short\n*int\n*long");
                }
                else if (b>=(long)-Math.pow(2,31) && b<=(long)Math.pow(2,31)){
                System.out.println("n can be fitted in:\n*int\n*long");
                }
                else if (b>=(long)-Math.pow(2,63) && b<=(long)Math.pow(2,63)){
                System.out.println("n can be fitted in:\n*long");
                }
            /*else{
                System.out.println("n can't be fitted anywhere");*/
            
            }
            else{
                //String nn=""+b;
            	System.out.println(obj.next()+"n can't be fitted anywhere");
                //obj.next();
                //long b=obj.nextLong();
            }
            
        }
        obj.close();
    }
}