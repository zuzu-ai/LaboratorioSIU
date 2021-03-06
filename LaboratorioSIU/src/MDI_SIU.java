
import Asignaciones.Asignacion_Maestros_BarriosR;
import Mantenimiento.Cursos_BarriosR;
import Mantenimiento.Maestros_BarriosR;


import Mantenimiento.Seccion_QuemeH;
import Mantenimiento.Facultad_QuemeH;
import Asignaciones.AsignacionM_QuemeH;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Mantenimiento.inf_M_Al_FloresK;

/**
 *
 * @author Sucely Alvarez
 */
public class MDI_SIU extends javax.swing.JFrame {

    private Maestros_BarriosR ventanamaestros;
    private Cursos_BarriosR ventanacursos;
    private Asignacion_Maestros_BarriosR ventanaAsignacionM;
    


 private inf_M_Al_FloresK ventanaMA;

    Facultad_QuemeH ventanafacultad;
    Seccion_QuemeH ventanaseccion;
    AsignacionM_QuemeH ventanaam;


    /**
     * Creates new form MDI_SIU
     */
    public MDI_SIU() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {


        JdesktopPane1 = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();

        desktopPane = new javax.swing.JDesktopPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        menuBar = new javax.swing.JMenuBar();
        Mantenimientos = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        Asignaciones = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


        jToolBar1.setRollover(true);
        JdesktopPane1.add(jToolBar1);
        jToolBar1.setBounds(380, 100, 100, 25);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        desktopPane.add(jDesktopPane1);
        jDesktopPane1.setBounds(0, 0, 710, 470);

        Mantenimientos.setMnemonic('f');
        Mantenimientos.setText("Mantenimientos");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Maestros");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        Mantenimientos.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Alumnos");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        Mantenimientos.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Facultad");
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        Mantenimientos.add(saveAsMenuItem);

        jMenuItem1.setText("Carreras");
        Mantenimientos.add(jMenuItem1);

        jMenuItem2.setText("Cursos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Mantenimientos.add(jMenuItem2);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Seccion");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        Mantenimientos.add(exitMenuItem);

        menuBar.add(Mantenimientos);

        Asignaciones.setMnemonic('e');
        Asignaciones.setText("Asignaciones");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Asignar Alumno");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        Asignaciones.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Asignar Maestro");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        Asignaciones.add(copyMenuItem);

        menuBar.add(Asignaciones);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Salida");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Salida");
        helpMenu.add(contentMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JdesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JdesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        ventanaseccion=new Seccion_QuemeH();
        jDesktopPane1.add(ventanaseccion);
    }//GEN-LAST:event_exitMenuItemActionPerformed


    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        ventanamaestros=new Maestros_BarriosR();
        JdesktopPane1.add(ventanamaestros);

        // TODO add your handling code here:
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
ventanacursos=new Cursos_BarriosR();
        JdesktopPane1.add(ventanacursos);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        ventanaAsignacionM=new Asignacion_Maestros_BarriosR();
        JdesktopPane1.add(ventanaAsignacionM);        // TODO add your handling code here:

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
 
        // TODO add your handling code here:
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        ventanaMA =new inf_M_Al_FloresK();
        jDesktopPane1.add( ventanaMA);
        // TODO add your handling code here:
    }//GEN-LAST:event_saveMenuItemActionPerformed
    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed
        // TODO add your handling code here:
        ventanafacultad=new Facultad_QuemeH();
        jDesktopPane1.add(ventanafacultad);
    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        // TODO add your handling code here:
        ventanaam=new AsignacionM_QuemeH();
        jDesktopPane1.add(ventanaam);

    }//GEN-LAST:event_copyMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MDI_SIU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDI_SIU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDI_SIU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDI_SIU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDI_SIU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Asignaciones;
    private javax.swing.JDesktopPane JdesktopPane1;
    private javax.swing.JMenu Mantenimientos;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
