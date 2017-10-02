package fr.parisnanterre.miage.poa.TDD.fr.p10.miage.rps.model;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by arielnataf on 02/10/2017.											 ============/¯¯¯¯\============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  | \)  (/ |  ---  /-
 * remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
 * to safeguard the human race and to offer His protection to the faithful.  		  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms. Heretic beware His wrath.			      ||||
 */
public class RockPaperScissors {
    public RockPaperScissors() {
    }

    public Result Play(RPSEnum p1, RPSEnum p2){
        if( (   p1.equals(p1.PAPER) && p2.equals(p2.ROCK    ))  ||
            (   p1.equals(p1.ROCK) && p2.equals(p2.CISSORS  ))  ||
            (   p1.equals(p1.CISSORS) && p2.equals(p2.PAPER ))){
            return Result.WIN;}

        return Result.LOST;
    }
}
