
//public class nest_for_loop {
	//import java.io.*;
	import java.util.*;

	public class nest_for_loop {

	    public static void main(String[] args) {
	        Scanner obj=new Scanner(System.in);
	        int query=obj.nextInt();
	        for (int i=0;i<query;++i){
	            int a=obj.nextInt();
	            int b=obj.nextInt();
	            int n=obj.nextInt();
	            String ans="";
	            for (int i1=1;i1<=n;++i1){
	                int u=0;
	                int ta=0;
	                for (;u<i1;++u){
	                    int kl=(int)Math.pow(2,u);
	                    ta=ta+kl;
	                }
	                int t=a+(ta*b);
	                ans=ans+t+" ";
	            }
	            System.out.println(ans.trim());
	        }
	        obj.close();
	    }
	}

