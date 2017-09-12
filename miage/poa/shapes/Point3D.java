package fr.parisnanterre.miage.poa.shapes;

/**
 * Created by arielnataf on 11/09/2017.
 */
public class Point3D extends Point2D {
    public double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    protected boolean isOrigin(){
        // vérifie si le point est à l'origine (0 à toutes les unités)

        if((this.x == 0) && (this.y == 0) && (this.z==0)){
            return true;
        }
        return false;
    }

    public void translate (double a, double b,double c) {
        // va décaler le point de a, b et c unités respectivement les axes sur x, y et z.

        this.x=this.x+a;
        this.y=this.y+b;
        this.z=this.z+c;
    }

    private double distance(Point3D pt){
        //Pythagore EN 3D
        return Math.sqrt(Math.pow(this.y-pt.y,2)+Math.pow(this.x-pt.x,2)+Math.pow(this.z-pt.z,2));
    }
}
