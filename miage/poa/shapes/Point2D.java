package fr.parisnanterre.miage.poa.shapes;

/**
 * Created by arielnataf on 11/09/2017.											 ============/    \============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  | \)  (/ |  ---  /-
 remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
 to safeguard the human race and to offer His protection to the faithful.  			  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms. Heretic beware His wrath.			      ||||
 */

public class Point2D {public double x;
public double  y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private void translate(double x , double y){
        double tmp;

        tmp=x;
        this.x= y;
        this.y= tmp;
    }

    protected boolean isOrigin(){
        if((this.x == 0) && (this.y == 0)){
            return true;
        }
        return false;
    }

    private double distance(Point2D pt){
        return Math.sqrt(Math.pow(this.y-pt.y,2)+Math.pow(this.x-pt.x,2));
    }

}
