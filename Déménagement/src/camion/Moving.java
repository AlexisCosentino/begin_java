
package camion;
public class Moving {
	public static void main(String[] args) {
	int cartonTotal = 34;
	int moving = 0;
	int moved = 0;
	
	while (cartonTotal > 0) {
		if (cartonTotal >= 9) {
			moving = 9;
			System.out.println("Le camion vient faire un trajet avec " + moving + " cartons.");
			moved += moving;
		} else{
			moving = cartonTotal;
			System.out.println("Le camion vient faire un trajet final avec " + moving + " cartons.");
			moved += cartonTotal;
		}
		cartonTotal -= moving;
		moving = 0;
	}
	System.out.println(moved + " Cartons ont bien �t� d�m�nag�s !");
}
}
