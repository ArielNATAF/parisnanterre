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
public abstract class Enseignant extends Personnel {
    public int salaire;
    public Date recrute;

    public Enseignant(String nom, String prenom, int numeroSS, Departement departement, int salaire, Date recrute) {
        super(nom, prenom, numeroSS, departement);
        this.salaire = salaire;
        this.recrute = recrute;
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaire=" + salaire +
                ", numeroSS=" + numeroSS +
                ", recrute=" + recrute +
                '}';
    }
}
