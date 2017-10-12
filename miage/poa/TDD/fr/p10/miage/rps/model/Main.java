package fr.parisnanterre.miage.poa.TDD.fr.p10.miage.rps.model;

import java.util.Random;

/**
 * Created by arielnataf on 12/10/2017.											 ============/¯¯¯¯\============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  | \)  (/ |  ---  /-
 * remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
 * to safeguard the human race and to offer His protection to the faithful.  		  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms. Heretic beware His wrath.			      ||||
 */
public class Main {
    public static void main(String args[]){
        System.out.println(RPSEnum.PAPER.getId());
        Player p1 = new Player("Jojo");

        Random random = new Random();
        for(int i=0; i<20;i++){
            System.out.print(i+":"+p1.getNextMove(i)+" - ");

         }
        System.out.println();
    }
}
