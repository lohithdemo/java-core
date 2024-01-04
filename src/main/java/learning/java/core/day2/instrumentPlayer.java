package learning.java.core.day2;

/**
 * Iinstrument player
 * @author Lohith.Samaga
 *
 */
public class instrumentPlayer {
	
	private Piano p;
	private Veena v;

	public instrumentPlayer() {
		p = new Piano();
		v = new Veena();
	}
	
	private void play() {
		System.out.println(p.play());
		System.out.println(v.play());
		//System.out.println(p instanceof Instrument);
		System.out.println(v instanceof Instrument);
	}
		
	public static void main(String[] args) {
		
		instrumentPlayer ip = new instrumentPlayer();
		ip.play();
	}
	
 }
