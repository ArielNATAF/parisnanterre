package fr.parisnanterre.miage.poa.Personnels;

/**
 * Created by arielnataf on 25/09/2017.											 ============/    \============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  | \)  (/ |  ---  /-
 * remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
 * to safeguard the human race and to offer His protection to the faithful.  			  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms. Heretic beware His wrath.			      ||||
 */
public class Doctorant extends Etudiant {
    @Override
    public String toString() {
        return "Doctorant{" +
                "nom='" + nom + '\'' +
                ", bourse=" + bourse +
                ", prenom='" + prenom + '\'' +
                ", numeroSS=" + numeroSS +
                '}';
    }

    public Doctorant(String nom, String prenom, int numeroSS, Departement departement, boolean bourse) {
        super(nom, prenom, numeroSS, departement, bourse);
    }
}
