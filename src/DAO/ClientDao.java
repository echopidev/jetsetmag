/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Adminstrateur;
import Entities.Client;
import Entities.Contact;
import Entities.Commenter;
import connectionBD.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ferchichi
 */
public class ClientDao {
    
    public void inscrir(Client cl){
    
    String requete = "insert into client (nom,prenom,mail,sexe,date_naissance,etat,comportement,cin) values (?,?,?,?,?,0,0,?)";
        try { 
            
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            
            ps.setString(1, cl.getNom());
            ps.setString(2, cl.getPrenom());
            ps.setString(3,cl.getMail() );
            ps.setString(4, cl.getSexe());
            ps.setString(5, cl.getDate_naissance());
            
            ps.setString(6, cl.getCin());
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
            
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(" erreur "+ex.getMessage());
        }
    }
    
   
      
  
   public Client getClient (String nom,String prenom){

        String requete = "select * from client where nom= ? and prenom = ?  ";
        try {
             PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        
            ps.setString(1,nom);
            ps.setString(2,prenom);
          
            ResultSet resultat = ps.executeQuery();
            
            while(resultat.next()){
                
                Client cll =new Client();
          
                cll.setNom(resultat.getString(2));
                cll.setPrenom(resultat.getString(3));
                cll.setComportement(resultat.getInt(8));
                
                
               return cll; 

                    
            }
            return null;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des reclamation "+ex.getMessage());
            return null;
        }
    }
   
           public void updateComportement(Client c){
               
               String requete_up = "update client set comportement =? where nom=? and prenom = ?";
               
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete_up);
            
          
            ps.setInt(1, c.getComportement()+1);
            ps.setString(2, c.getNom());
            ps.setString(3, c.getPrenom());
            
            
            ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
           
            System.out.println("erreur lors de la mise à jour "+ex.getMessage());
        }
    }
           
           
        public List<Contact> DisplayAllReclamation (){
        List<Contact> listeReclamation = new ArrayList<Contact>();
        String requete = "select * from contact";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            ClientDao clientdao = new ClientDao();
            while(resultat.next()){
            Contact co =new Contact();
                
                
                co.setNom_co(resultat.getString(2));
                co.setPrenom_co(resultat.getString(3));
                co.setMail_co(resultat.getString(4));
                co.setMessage_co(resultat.getString(5));
                
                listeReclamation.add(co);
            }
            return listeReclamation;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des reclamation "+ex.getMessage());
            return null;
        }
    }
     
        
        
        
   
           
           public void insertContactClient (Contact cn){
           String requete = "insert into contact (nom,prenom,email,message) values (?,?,?,?)";
        try { 
            
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            
            ps.setString(1,cn.getNom_co());
            ps.setString(2,cn.getPrenom_co());
            ps.setString(3,cn.getMail_co());
            ps.setString(4,cn.getMessage_co());
            
            ps.executeUpdate();
            System.out.println("msg envoyer avec succès");
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'envoye "+ex.getMessage());
        }
    }  
    
public List<Client> RechercherBySexe(String sexe)
    {
        List<Client> ListClient= new ArrayList<Client>() ;
        
        String requete = "select * from client where sexe like '"+sexe+"' ";
        try {
            Statement ps = MyConnection.getInstance().createStatement();
            ResultSet res = ps.executeQuery(requete);
            
            while(res.next()){

                Client a = new Client();
                
                a.setSexe(res.getString(5));
                
                ListClient.add(a);
            }
            return ListClient;
    }catch (Exception ex)
      {
       System.out.println(ex.getMessage());
            return null;  
      }
    }
     

 public void deleteclient(int comp){

          String requete = "delete from client where comportement=3";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            
            ps.setInt(1, comp);
            ps.executeUpdate();
            
            System.out.println("Suppression effectuée avec succès");
            } catch (SQLException ex) {
           
            System.out.println("erreur lors de la suppression "+ex.getMessage());
        }
    }
public void Enregistrer_Commenter(Commenter com){
    
    String requete = "insert into commenter (sujet,comment) values (?,?)";
        try { 
            
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            
            ps.setString(1, com.getSujet());
            ps.setString(2, com.getComment());
           
            ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
            
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(" erreur "+ex.getMessage());
        }
    }
 
  public List<Commenter> DisplayAllcommenter (){
        List<Commenter> listeCommenter = new ArrayList<Commenter>();
        String requete = "select * from commenter";
        try {
            Statement statement = MyConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            ClientDao clientdao = new ClientDao();
            while(resultat.next()){
            Commenter co =new Commenter();
                
                
                co.setSujet(resultat.getString(2));
                co.setComment(resultat.getString(3));
                
                
                listeCommenter.add(co);
            }
            return listeCommenter;
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des commenter "+ex.getMessage());
            return null;
        }
    }

}
