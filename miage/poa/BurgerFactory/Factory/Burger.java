package fr.parisnanterre.miage.poa.BurgerFactory.Factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by arielnataf on 06/11/2017.											 ============/¯¯¯¯\============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  | \)  (/ |  ---  /-
 * remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
 * to safeguard the human race and to offer His protection to the faithful.  		  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms. Heretic beware His wrath.			      ||||
 */
public class Burger {
	Menu typeMenu;
	List<Sauce> sauce;

	public Burger(Menu typeMenu) {
		this.typeMenu = typeMenu;
		this.sauce= new ArrayList<Sauce>();
	}

	public void with_sauce(Sauce typeSauce){
		this.sauce.add(typeSauce);
	}

	@Override
	public String toString() {
		return "Burger{" +
				" typeMenu=" + typeMenu.getNomMenu() +
				" sauce " + sauce +
				'}';
	}
}
