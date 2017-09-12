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
        if((this.x == 0) && (this.y == 0) && (this.z==0)){
            return true;
        }
        return false;
    }

    private double distance(Point3D pt){
        return Math.sqrt(Math.pow(this.y-pt.y,2)+Math.pow(this.x-pt.x,2)+Math.pow(this.z-pt.z,2));
    }
}
