package fr.parisnanterre.miage.poa.BurgerFactory.Factory;

/**
 * Created by arielnataf on 06/11/2017.											 ============/¯¯¯¯\============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  | \)  (/ |  ---  /-
 * remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
 * to safeguard the human race and to offer His protection to the faithful.  		  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms. Heretic beware His wrath.			      ||||
 */
public class BigBurgerRestaurant {

	private static BigBurgerRestaurant Instance;

	public static BigBurgerRestaurant getInstance() {
		if (Instance == null){Instance=new BigBurgerRestaurant();}
		return Instance;
	}

	private BigBurgerRestaurant(){}

	public Burger orderBurger(Menu m){
		Burger b;
		if(m == Menu.MENU_BEEF){ b = new Burger(Menu.MENU_BEEF); b.with_sauce(Sauce.BARBECUE);}
		else { b = new Burger(Menu.MENU_FISH); b.with_sauce(Sauce.BEARNAISE);}
		return b;
	}
}
