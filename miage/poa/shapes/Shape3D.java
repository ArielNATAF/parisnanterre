package fr.parisnanterre.miage.poa.shapes;

/**
 * Created by arielnataf on 11/09/2017.											 ============/    \============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  |  )  (  |  ---  /-
 remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
 to safeguard the human race and to offer His protection to the faithful.  			  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms, so Heretic beware His warth.		      ||||
 */

public abstract class Shape3D {
    Point3D refPoint;


    public Shape3D(Point3D refPoint) {
        this.refPoint = refPoint;
    }

    private double volume(){return 0;}

    public Point3D getRefPoint() {
        return refPoint;
    }
}
