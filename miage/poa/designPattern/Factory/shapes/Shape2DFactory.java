package fr.parisnanterre.miage.poa.designPattern.Factory.shapes;

import fr.parisnanterre.miage.poa.designPattern.Factory.shapes.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by arielnataf on 23/10/2017.											 ============/¯¯¯¯\============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  | \)  (/ |  ---  /-
 * remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
 * to safeguard the human race and to offer His protection to the faithful.  		  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms. Heretic beware His wrath.			      ||||
 */
public class Shape2DFactory {
    public Shape2DFactory() {
    }

    public Carre constructCarre(double x, double y, double length){
        Point2D p2D = new Point2D(x,y);
        Carre c = new Carre(p2D, length);
        return c;
    }

    public Rectangle constructRectangle(double x, double y, double length, double width){
        Point2D p2D = new Point2D(x,y);
        Rectangle c = new Rectangle(p2D, length, width);
        return c;
    }



//  private static Map<String, Shape2D> registry2D = new HashMap<String, Shape2D>();
//
//  public static void registerShape2D(String name, Shape2D s){
//     registry2D.put(name, s);
//  }
//
//  public Shape2D createShape2D(String name){
//      return (Shape2D) registry2D.get(name).createShape2D();
//  }

}

