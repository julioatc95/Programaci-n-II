package laboratorioparcial;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.table.DefaultTableModel;
/**
 * Nombre: Julio Andree Trujillo Cabrera
 * Carnet: 0901-17-3547
 */


public class Principal extends javax.swing.JFrame {
    Random RanNombre, RanNota;
    int intNombre, intNota;
    double DblSumaNotas=0, DblPromedio;
    
    DecimalFormat Decimales = new DecimalFormat("###.##");
    String [] vectorColumnas = {"Nombre Del Alumno", "Nota", "Resultado"};   
    String strNombre, strResultado;    
    
    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void Ingreso(){
        DefaultTableModel Modelo = (DefaultTableModel) TblResultados.getModel();
        Modelo.setRowCount(10);
        Modelo.setColumnCount(3);
        Modelo.setColumnIdentifiers(vectorColumnas);
        DblSumaNotas=0;
        for (int Fila = 0; Fila < 10; Fila++) {
            for (int Columna = 0; Columna < 4; Columna++) {
                if (Columna==0) {
                    TblResultados.setValueAt(Nombre(),Fila,Columna); 
                }
                if (Columna==1) {
                    intNota = 50 +(int)(Math.random()*50);
                    DblSumaNotas=intNota+DblSumaNotas;
                    
                    if (intNota<61) {
                      strResultado="NO GANO";
                    }else{
                      strResultado="GANO"; 
                    }
                    TblResultados.setValueAt(intNota,Fila,Columna); 
                }
                if (Columna==2) {
                    TblResultados.setValueAt(strResultado,Fila,Columna); 
                }
            }
            DblPromedio=DblSumaNotas/10;
            LblResultado.setText("El Promedio De La Clase Es: "+DblPromedio);
        }
    }
    
    public String Nombre(){
        intNombre = 1 +(int)(Math.random()*10);
        switch (intNombre){
            case 1: strNombre="Julio Trujillo"; break;
            case 2: strNombre="Javier Argueta"; break;
            case 3: strNombre="Mario Cabrera"; break;
            case 4: strNombre="Jose Ramirez"; break;
            case 5: strNombre="Esteban Monterroso"; break;
            case 6: strNombre="Pablo Garcia"; break;
            case 7: strNombre="Victor Gonzales"; break;
            case 8: strNombre="Stefanie Campos"; break;
            case 9: strNombre="Mario Camposeco"; break;
            case 10: strNombre="Andree Cabrera"; break;
            
        }
        return strNombre;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TblResultados = new javax.swing.JTable();
        BtnGenerar = new javax.swing.JButton();
        LblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TblResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre Del Alumno", "Nota", "Resultado Final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblResultados);
        if (TblResultados.getColumnModel().getColumnCount() > 0) {
            TblResultados.getColumnModel().getColumn(0).setResizable(false);
            TblResultados.getColumnModel().getColumn(1).setResizable(false);
            TblResultados.getColumnModel().getColumn(2).setResizable(false);
        }

        BtnGenerar.setText("Generar Resultados");
        BtnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(LblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                        .addGap(306, 306, 306))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(BtnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGenerarActionPerformed
        Ingreso();
    }//GEN-LAST:event_BtnGenerarActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGenerar;
    private javax.swing.JLabel LblResultado;
    private javax.swing.JTable TblResultados;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
