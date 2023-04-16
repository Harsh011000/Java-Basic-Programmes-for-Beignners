import java.util.*;
public class loop1 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        obj.close();
        //int i=1;
        for (int i=1,j=2;i<=10;){
            //int r=a*i;
            System.out.println(a);
            ++i;
            System.out.println(i+"+5"+j);
        }
	}

}