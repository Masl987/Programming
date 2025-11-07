package p2;

public class P2_main {
public static void main(String[] args) {
	int a = 50;
	int b = 50;
	int c = 100;
	int d = 47;
	
	d=0;
	if (a==b) {
		d++;
	}
	if (a==b || a==c) {
		d++;
	}
	if ((a+b) >= c) {
		d++;
	}
	if ((a+b+c) >= 100) {
		d++;
	}
	
	System.out.println(d);
}
}
