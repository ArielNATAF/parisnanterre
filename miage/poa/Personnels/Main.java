package fr.parisnanterre.miage.poa.Personnels;

import javax.print.Doc;
import java.util.Date;

/**
 * Created by arielnataf on 25/09/2017.											 ============/¯¯¯¯¯\============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  | \)  (/ |  ---  /-
 * remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
 * to safeguard the human race and to offer His protection to the faithful.  	 	  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms. Heretic beware His wrath.			      ||||
 */

public class Main{
    public static void main(String[] args){
        Etudiant p1 = new Etudiant("John","J'onzz", 1, Departement.LANGUE, false);
        Doctorant p2 = new Doctorant("Clark","Ken",2,Departement.INFORMATIQUE, true);
        EnseignantPermanent p3 = new MaitreConferences("Diana","Prince", 3,Departement.PHILOSOPHIE,10, new Date(),"Mythologie") ;
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}
