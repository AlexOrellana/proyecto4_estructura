/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;

/**
 *
 * @author alex
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    ArrayList<Individuo> lista_personas = new ArrayList<>();
    ArrayList<grupo> lista_grupos = new ArrayList<>();
    int descansos = 0;
    int num_personas = 0;
    boolean oneCouple = false;

    public main() {
        initComponents();
        this.setLocationRelativeTo(this);
        try {
            String s1;
            String s2;
            String nombre;
            BufferedReader br = new BufferedReader(new FileReader("people.txt"));

            while ((s1 = br.readLine()) != null) {
                int numTokens = 0;
                StringTokenizer st = new StringTokenizer(s1);
                while (st.hasMoreTokens()) {
                    s2 = st.nextToken();
                    if (s2.contains("&")) {
                        lista_personas.add(new Individuo(s2, true, false, false, 0));
                    } else {
                        lista_personas.add(new Individuo(s2, false, false, false, 0));
                    }
                    numTokens++;
                }
            }
            br.close();
        } catch (Exception e) { //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nuevas_listas = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        descansos_lideres = new javax.swing.JTextField();
        solo_una_pareja = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        personas_por_grupo = new javax.swing.JTextField();
        botton_listo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        listas = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        grupos = new javax.swing.JComboBox<>();
        ver_grupos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        ver_lista = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jLabel3.setText("número de personas por grupo:");

        jLabel4.setText("Solo una pareja por grupo?");

        solo_una_pareja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO", " " }));

        jLabel5.setText("número de turnos de descanso del líder de grupo");

        botton_listo.setText("LISTO");
        botton_listo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botton_listoActionPerformed(evt);
            }
        });

        jLabel6.setText("INFORMACION");

        jButton4.setText("salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nuevas_listasLayout = new javax.swing.GroupLayout(nuevas_listas.getContentPane());
        nuevas_listas.getContentPane().setLayout(nuevas_listasLayout);
        nuevas_listasLayout.setHorizontalGroup(
            nuevas_listasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevas_listasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nuevas_listasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(personas_por_grupo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(nuevas_listasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nuevas_listasLayout.createSequentialGroup()
                        .addComponent(botton_listo)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevas_listasLayout.createSequentialGroup()
                        .addGroup(nuevas_listasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(nuevas_listasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(218, 218, 218)
                                .addComponent(jButton4))
                            .addGroup(nuevas_listasLayout.createSequentialGroup()
                                .addGroup(nuevas_listasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(solo_una_pareja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(nuevas_listasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(descansos_lideres, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))
                        .addGap(24, 24, 24))))
        );
        nuevas_listasLayout.setVerticalGroup(
            nuevas_listasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevas_listasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nuevas_listasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jButton4))
                .addGap(36, 36, 36)
                .addGroup(nuevas_listasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(nuevas_listasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(solo_una_pareja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personas_por_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descansos_lideres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(botton_listo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("LISTAS");

        grupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gruposActionPerformed(evt);
            }
        });

        ver_grupos.setText("Ver");
        ver_grupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_gruposActionPerformed(evt);
            }
        });

        jButton1.setText("Crear grupos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setText("salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout listasLayout = new javax.swing.GroupLayout(listas.getContentPane());
        listas.getContentPane().setLayout(listasLayout);
        listasLayout.setHorizontalGroup(
            listasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listasLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(19, 19, 19))
            .addGroup(listasLayout.createSequentialGroup()
                .addGroup(listasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listasLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(grupos, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ver_grupos))
                    .addGroup(listasLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jButton1)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        listasLayout.setVerticalGroup(
            listasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listasLayout.createSequentialGroup()
                .addGroup(listasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listasLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel7))
                    .addGroup(listasLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton6)))
                .addGap(39, 39, 39)
                .addGroup(listasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ver_grupos))
                .addGap(51, 51, 51)
                .addComponent(jButton1)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout ver_listaLayout = new javax.swing.GroupLayout(ver_lista.getContentPane());
        ver_lista.getContentPane().setLayout(ver_listaLayout);
        ver_listaLayout.setHorizontalGroup(
            ver_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ver_listaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                .addContainerGap())
        );
        ver_listaLayout.setVerticalGroup(
            ver_listaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ver_listaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Proyecto 4");

        jButton2.setText("Empezar desde cero");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Creacion de grupos");

        jButton3.setText("Ver listas creadas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Ver grafo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        grupos.removeAll();
        lista_grupos.clear();
        this.setVisible(false);
        nuevas_listas.setSize(800, 300);
        nuevas_listas.setVisible(true);
        nuevas_listas.setLocationRelativeTo(this);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        nuevas_listas.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void botton_listoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botton_listoActionPerformed
        // TODO add your handling code here:
        nuevas_listas.setVisible(false);
        this.setVisible(true);
        num_personas = Integer.parseInt(personas_por_grupo.getText());
        if (solo_una_pareja.getSelectedItem().toString() == "SI") {
            oneCouple = true;
        } else {
            oneCouple = false;
        }
        descansos = Integer.parseInt(descansos_lideres.getText());
        personas_por_grupo.setText("");
        descansos_lideres.setText("");
    }//GEN-LAST:event_botton_listoActionPerformed

    private void ver_gruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_gruposActionPerformed
        // TODO add your handling code here:
        String text = "";
        if (lista_grupos.size() == 0) {
            JOptionPane.showMessageDialog(this, "No ha creado ninguna lista para ver");
        } else {
            for (int i = 0; i < lista_grupos.size(); i++) {
                if (grupos.getSelectedItem().toString().equals(lista_grupos.get(i).toString())) {
                    for (int j = 0; j < lista_grupos.get(i).getIntegrantes().size(); j++) {
                        text += lista_grupos.get(i).getIntegrantes().get(j).toString();
                        text += "\n";
                    }
                }
            }
            jTextArea1.setText(text);
            ver_lista.setSize(400, 400);
            ver_lista.setLocationRelativeTo(this);
            ver_lista.setVisible(true);
        }
    }//GEN-LAST:event_ver_gruposActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        listas.setSize(400, 400);
        listas.setLocationRelativeTo(this);
        listas.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        listas.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean Todos_en_grupo = false;
        boolean no_mas_parejas = false;
        int integrados = 0;
        if (num_personas != 0 && descansos != 0) {
            while (Todos_en_grupo == false) {
                System.out.println("s");
                no_mas_parejas = false;
                int random = (int) (Math.random() * (lista_personas.size() - 1) + 0);
                grupo temp = new grupo(num_personas, oneCouple);

                int llenar = num_personas;
                while (llenar != 0) {
                    System.out.println(llenar);
                    random = (int) (Math.random() * (lista_personas.size() - 1) + 0);
                    do {
                        random = (int) (Math.random() * (lista_personas.size() - 1) + 0);
                    } while (lista_personas.get(random).enGrupo == true);

                    if (lista_personas.get(random).enGrupo == false) {

                        if (lista_personas.get(random).Lider == false && temp.getIntegrantes().isEmpty()) {

                            if (no_mas_parejas == true && lista_personas.get(random).EsPareja == true) {

                            } else if (lista_personas.get(random).EsPareja == true && llenar >= 2) {
                                lista_personas.get(random).Lider = true;
                                lista_personas.get(random).descansos_como_lider = descansos;
                                temp.getIntegrantes().add(lista_personas.get(random));
                                lista_personas.get(random).enGrupo = true;
                                llenar = llenar - 2;
                                if (temp.OneCouple == true) {
                                    no_mas_parejas = true;
                                }
                            } else if (lista_personas.get(random).EsPareja == false) {
                                lista_personas.get(random).Lider = true;
                                lista_personas.get(random).descansos_como_lider = descansos;
                                temp.getIntegrantes().add(lista_personas.get(random));
                                lista_personas.get(random).enGrupo = true;
                                llenar--;
                            }

                        } else if (temp.getIntegrantes().size() > 0) {

                            if (no_mas_parejas == true && lista_personas.get(random).EsPareja == true) {

                            } else if (lista_personas.get(random).EsPareja == true && llenar >= 2) {
                                temp.getIntegrantes().add(lista_personas.get(random));
                                lista_personas.get(random).enGrupo = true;
                                llenar = llenar - 2;
                                if (temp.OneCouple == true) {
                                    no_mas_parejas = true;
                                }
                                if (lista_personas.get(random).Lider == true) {
                                    lista_personas.get(random).descansos_como_lider = lista_personas.get(random).descansos_como_lider - 1;
                                    if (lista_personas.get(random).descansos_como_lider - 1 == 0) {
                                        lista_personas.get(random).Lider = false;
                                    }
                                }
                            } else if (lista_personas.get(random).EsPareja == false) {
                                temp.getIntegrantes().add(lista_personas.get(random));
                                lista_personas.get(random).enGrupo = true;
                                if (lista_personas.get(random).Lider == true) {
                                    lista_personas.get(random).descansos_como_lider = lista_personas.get(random).descansos_como_lider - 1;
                                    if (lista_personas.get(random).descansos_como_lider - 1 == 0) {
                                        lista_personas.get(random).Lider = false;
                                    }
                                }
                                llenar--;
                            }

                        }

                    }
                }

                lista_grupos.add(temp);

                for (int i = 0; i < lista_personas.size(); i++) {
                    if (lista_personas.get(i).enGrupo == true) {
                        integrados++;
                    }
                }

                if (integrados == lista_personas.size()) {
                    Todos_en_grupo = true;
                } else {
                    Todos_en_grupo = false;
                    if (lista_personas.size() - integrados < num_personas) {
                        for (int i = 0; i < lista_personas.size(); i++) {
                            if (lista_personas.get(i).enGrupo == false) {
                                random = (int) (Math.random() * (lista_grupos.size() - 1) + 0);
                                lista_grupos.get(random).integrantes.add(lista_personas.get(i));
                            }
                        }
                        Todos_en_grupo = true;
                    }
                }
            }
            for (int i = 0; i < lista_personas.size(); i++) {
                lista_personas.get(i).enGrupo = false;
            }
            for (int i = 0; i < lista_grupos.size(); i++) {
                grupos.addItem(lista_grupos.get(i).toString());
            }
        } else {
            JOptionPane.showMessageDialog(this, "No ingredo los datos en la opcion: EMPEZAR DESDE CERO, ingreselos y regrese");
        }
        //lista_grupos.add(lista_personas.get(random));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void gruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gruposActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_gruposActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (lista_grupos.size() != 0) {
            Graph graph = new SingleGraph("tutorial 1");
            graph.setStrict(false);
            graph.setAutoCreate(true);
            for (int i = 0; i < lista_grupos.size(); i++) {
                for (int j = 0; j < lista_grupos.get(i).integrantes.size(); j++) {
                    graph.addEdge(lista_grupos.get(i).integrantes.get(j).toString() + lista_grupos.get(i).integrantes.get(0).toString(), lista_grupos.get(i).integrantes.get(j).toString(), lista_grupos.get(i).integrantes.get(0).toString(), true);
                }
            }
            for (Node node : graph) {
                node.addAttribute("ui.label", node.getId());
            }
            graph.display();
        } else {

        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botton_listo;
    private javax.swing.JTextField descansos_lideres;
    private javax.swing.JComboBox<String> grupos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JDialog listas;
    private javax.swing.JDialog nuevas_listas;
    private javax.swing.JTextField personas_por_grupo;
    private javax.swing.JComboBox<String> solo_una_pareja;
    private javax.swing.JButton ver_grupos;
    private javax.swing.JDialog ver_lista;
    // End of variables declaration//GEN-END:variables
}
