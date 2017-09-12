package fr.parisnanterre.miage.poa.shapes;

/**
 * Created by arielnataf on 11/09/2017.											 ============/    \============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  | \)  (/ |  ---  /-
 remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
 to safeguard the human race and to offer His protection to the faithful.  			  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms. Heretic beware His wrath.			      ||||
 */
public class Cuboid extends Shape3D{
    public double length;
    public double width;
    public double height;

    public Cuboid(Point3D refPoint, double length, double width, double height) {
        super(refPoint);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double volume(){
        return length*width*height;
    }

    private double surface(){
        return 2*height*length + 2*height*width + 2*length*width;
    }
}
