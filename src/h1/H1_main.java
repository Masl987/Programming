package h1;

public class H1_main {
public static void main(String[] args) {
	
	double guthaben = -100;
	double monEingang = 200;
	int raiting =-2;
	boolean warnhinweis = false;
	boolean negativ = true;
	
	if (guthaben <0) {
		negativ = true;
	}else {
		negativ = false;
	}
	
	if (guthaben >0) {
		raiting += 3;
	}
	
	if (guthaben == 0) {
		raiting += 2;
	}
	
	if(guthaben<0 && Math.abs(monEingang) >= Math.abs(guthaben)) {
		raiting += 1;
	}
	
	if (guthaben>0 && Math.abs(monEingang) < Math.abs(guthaben)) {
		raiting -=1;
	}
	
	if (guthaben < 0 && Math.abs(monEingang) < Math.abs(guthaben) && raiting <0 ) {
		warnhinweis = true;
	}else {
		warnhinweis= false;
	}
	
	System.out.println(negativ);
	System.out.println(raiting);
	System.out.println(warnhinweis);
	
}
}
