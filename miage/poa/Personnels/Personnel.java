package fr.parisnanterre.miage.poa.Personnels;

/**
 * Created by arielnataf on 25/09/2017.											 ============/    \============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  | \)  (/ |  ---  /-
 * remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
 * to safeguard the human race and to offer His protection to the faithful.  			  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms. Heretic beware His wrath.			      ||||
 */
public abstract class Personnel {
    protected String nom;
    protected String prenom;
    protected int numeroSS;
    protected Departement departement;

    public Personnel(String nom, String prenom, int numeroSS, Departement departement) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroSS = numeroSS;
        this.departement = departement;
    }

    public Departement getDepartement() {
        return departement;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getNumeroSS() {
        return numeroSS;
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numeroSS=" + numeroSS +
                '}';
    }
}
