package fr.parisnanterre.miage.poa.shapes;

/**
 * Created by arielnataf on 11/09/2017.											 ============/    \============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  | \)  (/ |  ---  /-
 remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
 to safeguard the human race and to offer His protection to the faithful.  			  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms. Heretic beware His wrath.			      ||||
 */

public class Point2D {
    public double x;
    public double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void translate(double translateX , double translateY){
        // va décaler le point de tant d'unités respectivement les axes sur x et y.

        this.x=this.x+translateX;
        this.y=this.y+translateY;
    }

    public boolean isOrigin(){
        // vérifie si le point est à l'origine (0 à toutes les unités)

        if((this.x == 0) && (this.y == 0)){
            return true;
        }
        return false;
    }

    public double distance(Point2D pt){
        //Pythagore

        return Math.sqrt(Math.pow(this.y-pt.y,2)+Math.pow(this.x-pt.x,2));
    }

}
