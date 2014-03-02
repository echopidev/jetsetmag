/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author user
 */
public class Contact {
    
    private int num_contact ;
    private String nom_co;
    private String prenom_co;
    private String message_co ;
    private String mail_co;

    public Contact() {
    }

    public Contact(int num_contact, String nom_co, String prenom_co, String message_co, String mail_co) {
        this.num_contact = num_contact;
        this.nom_co = nom_co;
        this.prenom_co = prenom_co;
        this.message_co = message_co;
        this.mail_co = mail_co;
    }

    public int getNum_contact() {
        return num_contact;
    }

    public void setNum_contact(int num_contact) {
        this.num_contact = num_contact;
    }

    public String getNom_co() {
        return nom_co;
    }

    public void setNom_co(String nom_co) {
        this.nom_co = nom_co;
    }

    public String getPrenom_co() {
        return prenom_co;
    }

    public void setPrenom_co(String prenom_co) {
        this.prenom_co = prenom_co;
    }

    public String getMessage_co() {
        return message_co;
    }

    public void setMessage_co(String message_co) {
        this.message_co = message_co;
    }

    public String getMail_co() {
        return mail_co;
    }

    public void setMail_co(String mail_co) {
        this.mail_co = mail_co;
    }
    
    
    
    


    
}
