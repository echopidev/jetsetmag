/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfac;

/**
 *
 * @author user
 */

import DAO.ClientDao;
import Entities.Client;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import org.jfree.chart.*;
import org.jfree.chart.demo.PieChartDemo1;
import org.jfree.data.general.DefaultPieDataset;


public class Gestion_Statistique extends JFrame {
    
    DefaultPieDataset dataset = new DefaultPieDataset() ;
    JFreeChart graphe ;
    ChartPanel cp ;
    
    List<Client> A = new ArrayList<Client>();
    List<Client> B = new ArrayList<Client>();
    
    /**
     * Creates new form Gestion_Statistique
     */
    public Gestion_Statistique  ()  {
        ClientDao an = new ClientDao();
          
        A = an.RechercherBySexe("HOMME");
        B = an.RechercherBySexe("FEMME");
       
    int x = A.size();
    int y = B.size();
         
        dataset.setValue("Homme",new Double(x) );
        dataset.setValue("Femme",new Double(y) );
      
        graphe = ChartFactory.createPieChart3D(" Camemberg CLIENT ", dataset,true ,true ,false);
        cp = new ChartPanel(graphe);
        
        this.add(cp);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Gestion_Statistique pchart = new Gestion_Statistique();
       pchart.setVisible(true);
       pchart.setSize(500,500);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
