package fr.parisnanterre.miage.poa.Personnels;

/**
 * Created by arielnataf on 25/09/2017.											 ============/¯¯¯¯\============
 * This code is protected by the Light of the God-Emperor of Mankind.			-\  -----  | _    _ |  -----  /-
 * Even in his almost-Life, sitting on the Golden Throne, His mind must			  -\  ---  | \)  (/ |  ---  /-
 * remain vigilant at all times throughout the entire Imperium 					    -   --  \  ,,  / --   -
 * to safeguard the human race and to offer His protection to the faithful.  		  ------- |||| -------
 * Therefor, I, arielnataf, sing His sacred Psalms. Heretic beware His wrath.			      ||||
 */

public enum Departement {
    LANGUE("Langues"),
    PHILOSOPHIE("Philosophe"),
    DROIT("Droit"),
    MATHEMATIQUES("Mathématiques"),
    INFORMATIQUE("Informatique"),
    GESTION("Gestion"),
    SERVICE_DES_TRAITEMENTS("Service des Traitements"),
    SECRETARIAT_GENERAL("Secretariat Général"),
    COMPTABILITE("Comptabilité")
    ;
    private final String nomDep;

    Departement(String nomDep) {
        this.nomDep = nomDep;
    }

    public String getNomDep() {
        return nomDep;
    }
}
