package fr.parisnanterre.miage.poa.kot.shapes

/**
 * Created by arielnataf on 13/09/2017.											 ============/    \============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  | \)  (/ |  ---  /-
remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
to safeguard the human race and to offer His protection to the faithful.  			  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms. Heretic beware His wrath.			      ||||
 */


abstract class shape

// ------------------------ 2D ------------------------

abstract class shape2D(refPoint :Point2D):shape(){
    abstract fun perimeter()    :Double
}

open class rectangle(val length: Double, val width: Double, val refPoint: Point2D): shape2D(refPoint){

    override fun perimeter(): Double {
        return 2.0 * (length + width)
    }

    fun surface(): Double {
        return length * width
    }
}

class carre( length: Double,  width: Double,  refPoint: Point2D):rectangle(length,width, refPoint)

// ------------------------ 3D ------------------------

abstract class shape3D(refPoint: Point3D):  shape(){
    abstract fun volume():Double
}

class cone(val  height:Double, val  radius:Double, refPoint: Point3D): shape3D(refPoint) {

    override fun volume():  Double {
        return Math.PI * (radius*radius) * height /3.0
    }

    fun surface():  Double{
        return Math.PI * radius * (radius * Math.sqrt(height*height + radius*radius))
    }

}

class sphere(val radius: Double, refPoint: Point3D): shape3D(refPoint){
    override fun volume():Double {
        return 4.0 * Math.PI * radius*radius*radius /3.0
    }
}

class cuboid(val length: Double, val width: Double, val height: Double, refPoint: Point3D):shape3D(refPoint){
    override fun volume():Double {
        return length*width*height
    }
    fun surface(): Double{
        return 2*height*length + 2*height*width + 2*length*width
    }
}