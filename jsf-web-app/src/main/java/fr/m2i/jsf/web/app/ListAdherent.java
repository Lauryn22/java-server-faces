
package fr.m2i.jsf.web.app;

public class ListAdherent {
    
    private String name; 
    private String prenom;
    private int dateNaissance; 
    private String ville; 
    private String loisir;
    private char sexe;
    
    public ListAdherent() {

        }

    public ListAdherent(String name, String prenom, int dateNaissance, String ville, String loisir, char sexe ) {
        this.name = name;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.ville = ville;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getDateNaissace() {
        return dateNaissance;
    }

    public void setDateNaissace(int dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getVille() {
        return ville;
    }

    public void setVile(String ville) {
        this.ville = ville;
    }
    
    public String getLoisir() {
        return loisir;
    }

    public void setLoisir(String loisir) {
        this.loisir = loisir;
    }
    
    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }
  
    
}
