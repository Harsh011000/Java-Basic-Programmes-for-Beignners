
public class cla_arg {

	public static void main(String[] args) {
		//String e[]= {"1"," ","2"," ","3","4"};
		int g=Integer.parseInt(args[0]);
		for (int i=0;i<args.length;++i) {
			if (Integer.parseInt(args[i])>g) {
				g=Integer.parseInt(args[i]);
			}
		}
		System.out.println(g);

	}

}
