package fr.parisnanterre.miage.poa.TDD.fr.p10.miage.rps.model;

/**
 * Created by arielnataf on 02/10/2017.											 ============/¯¯¯¯\============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  | \)  (/ |  ---  /-
 * remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
 * to safeguard the human race and to offer His protection to the faithful.  		  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms. Heretic beware His wrath.			      ||||
 */
 public enum  RPSEnum {
    ROCK("paper",0),
    PAPER("rock",1),
    SCISSORS("scissors",2);
    private final String name;
    private final int id;

    RPSEnum(String name, int id) {
        this.name = name;
        this.id=id;
    }

    public int getId() {
        return id;
    }
}

