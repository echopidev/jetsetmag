/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;


import DAO.ClientDao;

import Entities.Commenter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author user
 */
public class Commenter_controller extends AbstractTableModel{
     String [] headrs = { "Sujet","Commenter"};
    List<Commenter> listeCommenter = new ArrayList<Commenter>();

    public Commenter_controller() {
        
        ClientDao reclamation = new ClientDao();
        listeCommenter = reclamation.DisplayAllcommenter();
        
    }
    
    

    @Override
    public int getRowCount() {
        return  listeCommenter.size();
    }

    @Override
    public int getColumnCount() {
        return  headrs.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
       {
          case 1 : return listeCommenter.get(rowIndex).getSujet();
          case 2 : return listeCommenter.get(rowIndex).getComment();
          
          default: return null;
       }
    }
    
    @Override
    public String getColumnName(int column) {
       return  headrs[column];
    }
    
}
