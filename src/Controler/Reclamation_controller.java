/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import DAO.ClientDao;

import Entities.Contact;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author user
 */
public class Reclamation_controller extends AbstractTableModel{
    
    String [] headrs = { "nom","prenom","email","message"};
    List<Contact> listreclamation = new ArrayList<Contact>();

    public Reclamation_controller() {
        
        ClientDao reclamation = new ClientDao();
        listreclamation = reclamation.DisplayAllReclamation();
        
    }
    
    

    @Override
    public int getRowCount() {
        return  listreclamation.size();
    }

    @Override
    public int getColumnCount() {
        return  headrs.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
       {
          case 0 : return listreclamation.get(rowIndex).getNom_co();
          case 1 : return listreclamation.get(rowIndex).getPrenom_co();
          case 2 : return listreclamation.get(rowIndex).getMail_co();
          case 3 : return listreclamation.get(rowIndex).getMessage_co();
          default: return null;
       }
    }
    
    @Override
    public String getColumnName(int column) {
       return  headrs[column];
    }
    
}
