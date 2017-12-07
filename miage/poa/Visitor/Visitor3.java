package fr.parisnanterre.miage.poa.Visitor;

/**
 * Created by arielnataf on 04/12/2017.											 ============/¯¯¯¯\============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  | \)  (/ |  ---  /-
 * remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
 * to safeguard the human race and to offer His protection to the faithful.  		  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms. Heretic beware His wrath.			      ||||
 */
public class Visitor3 implements VisitorAvecValeur {
	int nb;

	public Visitor3() {
		this.nb = 0;
	}

	@Override
	public void visit(Lamp l) {
		nb++;
	}

	@Override
	public void visit(Vetement v) {
		nb+=1;
	}

	@Override
	public void visit(GardeRobe g) {
		nb+=1;
	}

	@Override
	public Object value() {
		return nb;
	}
}
