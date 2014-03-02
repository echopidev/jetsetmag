/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Adminstrateur;
import Entities.Client;

import connectionBD.MyConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author ferchichi
 */
public class AdminDao {
    List<Client> cl = new ArrayList<Client>();
    
  
    
    public Adminstrateur verification(String login,String pwd){
        Adminstrateur admin=null;
        
         String requete = "update comportement set adresse_depot=? where id_depot=?";
        try {
            PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
            
            ResultSet resultat = ps.executeQuery();
            while (resultat.next())
            {
                admin.setLogin(resultat.getString(1));   
                admin.setPwd(resultat.getString(2));
            }
            
           
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur"+ex.getMessage());
            
        }
        return admin ;
    }
    
    
    
    public List<Client> valider(){
    
    
    
    String requete = "select * from Client where etat=0";
   
    
    try{
        
        
        PreparedStatement ps = MyConnection.getInstance().prepareStatement(requete);
        ResultSet res = ps.executeQuery();
        
        
        while (res.next()){

           cl.add(new Client( res.getInt(1),res.getString(2), res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getInt(7),res.getInt(8),res.getInt(9),res.getString(10),res.getString(11)));
        }
        return cl;
    }
        
        catch(SQLException ex){
            System.out.println("erreur lors du chargement"+ex.getMessage());
           
        }
     return cl;
    }
    
    
}
