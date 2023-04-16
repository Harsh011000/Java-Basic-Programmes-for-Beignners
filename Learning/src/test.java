import java.util.*;
public class test {

	void hello (){
		System.out.println("hello");
	}
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String v0="55+88+-63+2*2/9";
		String e[]={"/","*","+","-"};
        String sgn="";
		for (int i=0;i<4;){
            if (v0.charAt(0)=='+') {
            	v0=v0.replaceFirst("\\+","");
            	System.out.println(v0);
            }
            else if(v0.charAt(0)=='-') {
            	sgn="-";
            	v0=v0.replaceFirst("\\-","");
            }
            int ti=v0.indexOf(e[i]);
            if (ti!=-1){
            	int l=v0.length();
                String tn2="";
                String tn1="";
                if (!(Character.isDigit(v0.charAt(ti+1)))){
                    tn2=""+v0.charAt(ti+1);
                    for (int u=ti+2;u<l;++u){
                        if ((Character.isDigit(v0.charAt(u))) | v0.charAt(u)=='.'){
                            tn2+=v0.charAt(u);
                        }
                        else{
                            break;
                        }
                    }
                }
                else{
                    for (int u=ti+1;u<l;++u){
                        if ((Character.isDigit(v0.charAt(u))) | v0.charAt(u)=='.'){
                            tn2+=v0.charAt(u);
                        }
                        else{
                            break;
                        }
                    }
                }

                for (int u=ti-1;u>=0;--u){
                    if ((Character.isDigit(v0.charAt(u))) | v0.charAt(u)=='.'){
                        tn1=v0.charAt(u)+tn1;
                    }
                    else{
                        tn1=v0.charAt(u)+tn1;
                        break;
                    }
                }
                System.out.println(tn1+","+tn2);
                String tnr="";
                switch(i){
                    case 0:
                        tnr=""+(Double.parseDouble(sgn+tn1)/Double.parseDouble(tn2));
                        break;
                    case 1:
                        tnr=""+(Double.parseDouble(sgn+tn1)*Double.parseDouble(tn2));
                        break;
                    case 2:
                        tnr=""+(Double.parseDouble(sgn+tn1)+Double.parseDouble(tn2));
                        break;
                    case 3:
                        tnr=""+(Double.parseDouble(sgn+tn1)-Double.parseDouble(tn2));
                        break;
                }
                sgn="";
                if (Character.isDigit(tnr.charAt(0))){
                    v0=v0.replace((tn1+e[i]+tn2),("+"+tnr));
                }
                else{
                    v0=v0.replace((tn1+e[i]+tn2),tnr);
                }
                //v0=v0.replace((tn1+e[i]+tn2),tnr);
                //TextView pr=findViewById(R.id.ans);
                //pr.setText(v0);
                System.out.println(v0);
            }
            else{
                ++i;
            }
        }
		obj.close();
		//double mm=Double.parseDouble("-5");
		//System.out.println(mm);

	}

}
