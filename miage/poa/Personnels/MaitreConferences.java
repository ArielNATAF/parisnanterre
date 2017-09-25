package fr.parisnanterre.miage.poa.Personnels;

import java.util.Date;

/**
 * Created by arielnataf on 25/09/2017.											 ============/    \============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  | \)  (/ |  ---  /-
 * remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
 * to safeguard the human race and to offer His protection to the faithful.  			  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms. Heretic beware His wrath.			      ||||
 */
public class MaitreConferences extends EnseignantPermanent {
    @Override
    public String toString() {
        return "MaitreConferences{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaire=" + salaire +
                ", numeroSS=" + numeroSS +
                ", domaineRech='" + domaineRech + '\'' +
                ", recrute=" + recrute +
                '}';
    }

    public MaitreConferences(String nom, String prenom, int numeroSS, Departement departement, int salaire, Date recrute, String domaineRech) {
        super(nom, prenom, numeroSS, departement, salaire, recrute, domaineRech);
    }
}
