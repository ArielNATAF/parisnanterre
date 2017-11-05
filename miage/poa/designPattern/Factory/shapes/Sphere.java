package fr.parisnanterre.miage.poa.designPattern.Factory.shapes;

/**
 * Created by arielnataf on 11/09/2017.											 ============/    \============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  |  )  (  |  ---  /-
 remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
 to safeguard the human race and to offer His protection to the faithful.  			  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms, so Heretic beware His warth.		      ||||
 */

public class Sphere extends Shape3D {
    public double radius;

    public Sphere(Point3D refPoint, double radius) {
        super(refPoint);
        this.radius = radius;
    }

    public double volume(){
        return 4 * Math.PI * radius*radius*radius /3;
    }
}
