package fr.parisnanterre.miage.poa.BurgerFactory.Factory;

/**
 * Created by arielnataf on 06/11/2017.											 ============/¯¯¯¯\============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  | \)  (/ |  ---  /-
 * remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
 * to safeguard the human race and to offer His protection to the faithful.  		  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms. Heretic beware His wrath.			      ||||
 */
public enum Sauce {
	BURGER("Burger", 1000, 1),
	BARBECUE("BBQ", 2333, 1),
	BEARNAISE("BEA",3412,1);

	private final String nomSauce;
	private final int cal;
	private final double prix;

	Sauce(String nomSauce, int cal, double prix) {
		this.nomSauce = nomSauce;
		this.cal = cal;
		this.prix = prix;
	}

	public String getNomSauce() {
		return nomSauce;
	}
}
