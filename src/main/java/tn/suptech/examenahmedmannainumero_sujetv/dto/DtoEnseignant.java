package tn.suptech.examenahmedmannainumero_sujetv.dto;



public class DtoEnseignant {

    private Long id ;

    private  String prenom ;
    private  String nom ;



    private  String Email ;
    private Long numeroCarteIdentitee ;

    public DtoEnseignant() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }



    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Long getNumeroCarteIdentitee() {
        return numeroCarteIdentitee;
    }

    public void setNumeroCarteIdentitee(Long numeroCarteIdentitee) {
        this.numeroCarteIdentitee = numeroCarteIdentitee;
    }
}
