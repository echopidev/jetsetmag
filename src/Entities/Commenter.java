/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author user
 */
public class Commenter {
    
    private int id_commenter ;
    private String sujet ;
    private  String comment ;

    public Commenter ()
    {}
    public Commenter(int id_commenter, String sujet, String comment) {
        this.id_commenter = id_commenter;
        this.sujet = sujet;
        this.comment = comment;
    }

    public int getId_commenter() {
        return id_commenter;
    }

    public void setId_commenter(int id_commenter) {
        this.id_commenter = id_commenter;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    
    
}
