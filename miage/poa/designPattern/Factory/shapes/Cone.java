package fr.parisnanterre.miage.poa.designPattern.Factory.shapes;

/**
 * Created by arielnataf on 11/09/2017.											 ============/    \============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  | \)  (/ |  ---  /-
 remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
 to safeguard the human race and to offer His protection to the faithful.  			  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms. Heretic beware His wrath.			      ||||
 */
public class Cone extends Shape3D {
    public double height;
    public double radius;

    public Cone(Point3D refPoint, double height, double radius) {
        super(refPoint);
        this.height = height;
        this.radius = radius;
    }

    public double volume(){
        return Math.PI * (radius*radius) * height /3;
    }

    public double surface(){
        return Math.PI * radius * (radius * Math.sqrt(height*height + radius*radius));
    }
}
