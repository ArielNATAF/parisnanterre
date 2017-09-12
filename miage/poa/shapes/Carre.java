package fr.parisnanterre.miage.poa.shapes;

/**
 * Created by arielnataf on 11/09/2017.											 ============/    \============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  | \)  (/ |  ---  /-
 remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
 to safeguard the human race and to offer His protection to the faithful.  			  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms. Heretic beware His wrath.			      ||||
 */

public class Carre extends Rectangle {
    public Carre(Point2D refPoint, double length, double width) {
        super(refPoint, length, width);
    }

    @Override
    public String toString() {
        return "Carre{" +
                "length=" + length +
                ", width=" + width +
                ", surface=" + surface()+
                '}';
    }
}
