//import java.io.*;
import java.util.*;

public class test3 {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int nc=obj.nextInt();
        obj.nextLine();
        String e[]=new String[nc];
        for (int i=0;i<nc;++i){
            e[i]=obj.nextLine();
        }
        for (String i:e){
            if (i.length()>=8 && i.length()<=30){
                int c=0;
                for(int u=0;u<i.length();++u){
                    if(!(Character.isLetter(i.charAt(u)))&!(Character.isDigit(i.charAt(u)))&!(i.charAt(u)=='_')){
                        //System.out.println("Invalid");
                        ++c;
                        break;
                    }
                }
                System.out.println("coming"+c);
                if(Character.isLetter(i.charAt(0))& c==0){
                    System.out.println("Valid");
                }
                else{
                    System.out.println("Invalid");
                }
            }
            else{
                System.out.println("Invalid");
            }
        }
    }
}