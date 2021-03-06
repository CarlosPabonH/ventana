package main;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        File = new javax.swing.JFileChooser();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaLista = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Abrir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txaLista.setColumns(20);
        txaLista.setRows(5);
        jScrollPane1.setViewportView(txaLista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(302, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(293, 293, 293))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("CSV pulguita", "csv");  
        File.setFileFilter(filtro);                                   //se filtran los datos, para poderlos mostrar mas adelante 
        int result = File.showOpenDialog(this);                     //se declara una variable tipo entera
        if(result == JFileChooser.APPROVE_OPTION){                   //metodo que proporciona instrucciones al programa
        LectorCSV lector = new LectorCSV();                   //lee fichero csv
        lector.extraerDatos(File.getSelectedFile().getAbsolutePath());                   //metodo que extrae los datos del archivo csv
        lector.calcularPromedio(txaLista);                               //metodo para calcular el promedio
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser File;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaLista;
    // End of variables declaration//GEN-END:variables
}
