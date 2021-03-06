package fr.parisnanterre.miage.poa.designPattern.Factory.shapes;

/**
 * Created by arielnataf on 11/09/2017.											 ============/    \============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  | \)  (/ |  ---  /-
 remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
 to safeguard the human race and to offer His protection to the faithful.  			  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms. Heretic beware His wrath.			      ||||
 */
public class Point3D extends Point2D {
    public double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public boolean isOrigin(){
        // vérifie si le point est à l'origine (0 à toutes les unités)

        if((this.x == 0) && (this.y == 0) && (this.z==0)){
            return true;
        }
        return false;
    }

    public void translate (double translateX, double translateY,double translateZ) {
        // va décaler le point de tant d'unités respectivement les axes sur x, y et z.

        this.x=this.x+translateX;
        this.y=this.y+translateY;
        this.z=this.z+translateZ;
    }

    private double distance(Point3D pt){
        //Pythagore EN 3D
        return Math.sqrt(Math.pow(this.y-pt.y,2)+Math.pow(this.x-pt.x,2)+Math.pow(this.z-pt.z,2));
    }

    public void setZ(double z) {
        this.z = z;
    }
}
