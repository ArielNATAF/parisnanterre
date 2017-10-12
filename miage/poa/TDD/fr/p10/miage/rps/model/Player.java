package fr.parisnanterre.miage.poa.TDD.fr.p10.miage.rps.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by arielnataf on 08/10/2017.											 ============/¯¯¯¯\============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  | \)  (/ |  ---  /-
 * remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
 * to safeguard the human race and to offer His protection to the faithful.  		  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms. Heretic beware His wrath.			      ||||
 */
public class Player {
    public String nom;
    private Integer score;
    private List<RPSEnum> mouvements = new ArrayList<>();

    public Player(String nom, List<RPSEnum> mouvements) {
        this.nom = nom;
        this.score = 0;
        this.mouvements = mouvements;
    }

    public Player(String nom){
        this.nom = nom;

        Random random = new Random();
        for(int i=0; i<20;i++){
            int coupAleatoire = random.nextInt(3);
            if (coupAleatoire == 0) mouvements.add(RPSEnum.PAPER);
            if (coupAleatoire == 1) mouvements.add(RPSEnum.ROCK);
            if (coupAleatoire == 2) mouvements.add(RPSEnum.SCISSORS);
        }
        this.score =0;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public List<RPSEnum> getNextMove(Integer indice) {
        return mouvements.subList(indice+1, indice+1);
    }

    public void setMouvements(List<RPSEnum> mouvements) {
        this.mouvements = mouvements;
    }
}
