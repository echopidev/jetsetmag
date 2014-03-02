/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author ferchichi
 */
public class Client {
    
     private Client client ;
     private int id_client;
     private String nom;
     private String prenom;
     private String mail;
     private String cin;
     private String date_naissance;
     private String sexe;
     private int etat;
     private int comportement;
     
     

   
     
     public Client(){}
     
 public Client(int id_client,String nom,String prenom,String mail,String date_naissance,String sexe,int telephone,int etat,int comportement,String cin,String message){
       this.id_client=id_client;
       this.nom=nom;
       this.prenom=prenom;
       this.mail=mail;
       this.cin=cin;
       this.date_naissance=date_naissance;
       this.sexe=sexe;
       this.etat=etat;
       this.comportement=comportement;
       
   }  

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }
    
 
    
   public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
           }
    
     public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
           }
    
    public String getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(String date_naissance) {
        this.date_naissance = date_naissance;
           }
    
     public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
           }
    


            
    public int getComportement() {
        return comportement;
    }

    public void setComportement(int comportement) {
        this.comportement = comportement;
           }
    
      public int getetat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
           }

  
    
    public Client getClient()
    {
      return  client ;
    }

   
    
}
