package fr.parisnanterre.miage.poa.kot.shapes

/**
 * Created by arielnataf on 13/09/2017.											 ============/    \============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  | \)  (/ |  ---  /-
remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
to safeguard the human race and to offer His protection to the faithful.  			  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms. Heretic beware His wrath.			      ||||
 */

fun main(args: Array<String>) {
    val p =Point2D(1.0, 2.0)

    val p3=Point3D(3.0,2.0,1.0)
    val abs = p.x
    println("$abs")

    p.translate(1.0, 2.0)

    println("${p.x}")
    println("-----------------------------")
    println("x->${p3.x}, y->${p3.y}, z->${p3.z},")
    p3.translate(1.0,-2.0,5.0)
    println("x->${p3.x}, y->${p3.y}, z->${p3.z},")
}