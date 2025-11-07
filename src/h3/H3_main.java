package h3;

public class H3_main {
public static void main(String[] args) {
	int max = 5;
	int fix = 2;
	int wartend = 2;
	boolean istVoll;
	
	if (max <= fix) {
		istVoll = true;
	}else {istVoll = false;
	}
	
	System.out.println("Alles Voll: " + istVoll);
	
	while(fix < max && wartend > 0){
		
		fix += 1;
		wartend -= 1;
		System.out.println("Zugewiesen");
		}
	
	if (max <= fix) {
		istVoll = true;
	}else {istVoll = false;
	}
	
	System.out.println("Fixplätze:" + fix);
	System.out.println("Wartende:" + wartend);
	System.out.println("Alles Voll: " + istVoll);
}
}
