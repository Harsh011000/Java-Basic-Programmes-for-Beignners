import java.util.*;
class time{
	private int h;
	private int m;
	private int s;
	Scanner obj=new Scanner(System.in);
	void input() {
		h=obj.nextInt();
		m=obj.nextInt();
		s=obj.nextInt();
	}
	void add(time a,time b) {
		h=a.h+b.h;
		m=a.m+b.m;
		if (m>=60) {
			++h;
			m=m-60;
		}
		s=a.s+b.s;
		if (s>=60) {
			++m;
			s=s-60;
		}
	}
	void sub(time a,time b) {
		//h=a.h-b.h;
		//m=a.m-b.m;
		if (a.s<b.s) {
			--a.m;
			a.s+=60;
			s=a.s-b.s;
		}
		else {
			s=a.s-b.s;
		}
		if (a.m<b.m) {
			--a.h;
			a.m+=60;
			m=a.m-b.m;
		}
		else {
			m=a.m-b.m;
		}
		h=a.h-b.h;
		//s=a.s-b.s;
	}
	void display() {
		System.out.println(h+":"+m+":"+s);
	}
}
public class Time_class {

	public static void main(String[] args) {
		time ob1=new time();
		time ob2=new time();
		ob1.input();
		ob2.input();
		time ob3=new time();
		ob3.add(ob1, ob2);
		ob3.display();
		ob3.sub(ob1, ob2);
		ob3.display();
	}

}
