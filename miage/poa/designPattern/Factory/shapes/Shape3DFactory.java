package fr.parisnanterre.miage.poa.designPattern.Factory.shapes;

/**
 * Created by arielnataf on 23/10/2017.											 ============/¯¯¯¯\============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  | \)  (/ |  ---  /-
 * remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
 * to safeguard the human race and to offer His protection to the faithful.  		  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms. Heretic beware His wrath.			      ||||
 */
public class Shape3DFactory {
    private String shapeName;
    private Point3D p3D = new Point3D(0,0,0);

    public Shape3DFactory(String shapeName) {
        this.shapeName=shapeName;
    }

    public Shape3D createShape3D(){
        if (shapeName.equals("Sphere"))
                return new Sphere(p3D, 0);
        if (shapeName.equals("Cuboid"))
            return new Cuboid(p3D, 0,0,0);
        return null;
    }
}
