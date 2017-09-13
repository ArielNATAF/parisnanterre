package fr.parisnanterre.miage.poa.kot.shapes

/**
 * Created by arielnataf on 13/09/2017.											 ============/    \============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  | \)  (/ |  ---  /-
remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
to safeguard the human race and to offer His protection to the faithful.  			  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms. Heretic beware His wrath.			      ||||
 */


open class Point2D(var x:Double, var y:Double){

    fun translate( xTranslate:Double, yTranslate:Double){
        x += xTranslate
        y = y + yTranslate
    }

    open fun isOrigin():Boolean{
        if (x == 0.0 && y == 0.0 ) return true
        return false
    }

    open fun distance(pt: Point2D):Double {
        return Math.sqrt(Math.pow(y-pt.y,2.0) + Math.pow(x-pt.x,2.0))
    }
}

class Point3D( x:Double,  y:Double, var z:Double) : Point2D(x,y){
    fun translate(xTranslate: Double, yTranslate: Double, zTranslate: Double) {
        super.translate(xTranslate, yTranslate)
        z += zTranslate
    }

    override fun isOrigin(): Boolean {
        if (x == 0.0 && y == 0.0 && z == 0.0) return true
        return false
    }

    fun distance(pt: Point3D): Double {
        return Math.sqrt(Math.pow(y-pt.y,2.0) + Math.pow(x-pt.x,2.0) + Math.pow(z-pt.z,2.0))
    }
}

