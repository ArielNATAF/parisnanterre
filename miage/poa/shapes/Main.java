package fr.parisnanterre.miage.poa.shapes;

import fr.parisnanterre.miage.poa.shapes.Carre;
import fr.parisnanterre.miage.poa.shapes.Point2D;

/**
 * Created by arielnataf on 11/09/2017.
 */
public class Main {

    public static void main(String[] args){

        Point2D pt=new Point2D(3,2);
        Point2D pt2=new Point2D(1,5);
        Carre c=new Carre(pt, 5,3);

        System.out.println(c);
        System.out.println(pt2.distance(pt));
    }


}
