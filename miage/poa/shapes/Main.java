package fr.parisnanterre.miage.poa.shapes;

import fr.parisnanterre.miage.poa.shapes.Carre;
import fr.parisnanterre.miage.poa.shapes.Point2D;

/**
 * Created by arielnataf on 11/09/2017.											 ============/    \============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  | \)  (/ |  ---  /-
 remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
 to safeguard the human race and to offer His protection to the faithful.  			  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms. Heretic beware His wrath.			      ||||
 */
public class Main {

    public static void main(String[] args){

        Point2D pt=new Point2D(3,2);
        Point2D pt2=new Point2D(1,5);
        Point2D p0=new Point2D(0,0);
        Carre c=new Carre(pt, 5,3);

        System.out.println(c);
        System.out.println("distance entre pt et pt2: "+pt2.distance(pt));
        System.out.println("ancienne ref de pt, x="+pt.x+", y="+pt.y);
        pt.translate(2,-1);
        System.out.println("nouvelle ref de pt, x="+pt.x+", y="+pt.y);

        System.out.println("Origine ? pt : "+ pt.isOrigin()+" ; p0 : "+ p0.isOrigin());
    }
}
