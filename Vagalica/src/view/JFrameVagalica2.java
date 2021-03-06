/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import brojevi.Button;
import com.sun.jmx.snmp.BerDecoder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Nevena i Milena
 */
public class JFrameVagalica2 extends javax.swing.JFrame {

    /**
     * Creates new form JFrameVagalica2
     */
    public JFrameVagalica2() {
        initComponents();
        dodajKomponente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemNewGame = new javax.swing.JMenuItem();
        jMenuItemExit = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu3.setText("Menu");

        jMenuItemNewGame.setText("New Game");
        jMenuItemNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNewGameActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemNewGame);

        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemExit);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNewGameActionPerformed
       
    }//GEN-LAST:event_jMenuItemNewGameActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemExitActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameVagalica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameVagalica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameVagalica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameVagalica2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameVagalica2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemNewGame;
    // End of variables declaration//GEN-END:variables

    private JLabel label;
    private String random;
    public JPanel panel;
    public JPanel panel1;
    public JPanel panel2;
    public JPanel centar;
    
    public JPanel centarBottom;
    public JPanel panel1Bottom;
    public JPanel panel2Bottom;
    
    public JPanel panel1Centar;
    public JPanel panel2Centar;
    public JPanel centarCentar;

    
    public void dodajKomponente(){
        panel = new JPanel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        centar = new JPanel();
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(520,520));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
                
        add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(1, 3));
        
        panel.add(panel1);
        panel.add(centar);
        panel.add(panel2);
                
        centar.setLayout(new BorderLayout());
        panel1.setLayout(new BorderLayout());
        panel2.setLayout(new BorderLayout());
        
        panel1Bottom = new JPanel();        
        panel1Bottom.setBackground(new Color(155, 247, 238));
        panel1.add(panel1Bottom, BorderLayout.SOUTH);
        panel1Bottom.setPreferredSize(new Dimension(50,50));
        
        panel2Bottom = new JPanel();        
        panel2Bottom.setBackground(new Color(249, 106, 106));
        panel2.add(panel2Bottom, BorderLayout.SOUTH);
        panel2Bottom.setPreferredSize(new Dimension(50,50));
        
        centarBottom = new JPanel();        
        centarBottom.setBackground(Color.white);
        centar.add(centarBottom, BorderLayout.SOUTH);
        centarBottom.setPreferredSize(new Dimension(50,50));
        
        panel1Centar = new JPanel();
        panel2Centar = new JPanel();
        centarCentar = new JPanel();
        
        panel1Centar.setBackground(new Color(155, 247, 238));
        panel2Centar.setBackground(new Color(249, 106, 106));
        centarCentar.setBackground(Color.white);
        
        panel1.add(panel1Centar, BorderLayout.CENTER);
        panel2.add(panel2Centar, BorderLayout.CENTER);
        centar.add(centarCentar, BorderLayout.CENTER);
        
        panel1Centar.setLayout(new GridLayout(0, 1));
        panel2Centar.setLayout(new GridLayout(0, 1));
        centarCentar.setLayout(new GridLayout(0, 2));
        
        JLabel labela1 = new JLabel("Player 1");
        JLabel labela2 = new JLabel("Player 2");
        label = new JLabel("-XXX-");
        
        labela1.setFont(new Font("Tahoma", Font.BOLD, 14));
        labela2.setFont(new Font("Tahoma", Font.BOLD, 14));
        label.setFont(new Font("Tahoma", Font.BOLD, 14));
                
        panel1Bottom.add(labela1, BorderLayout.CENTER);
        panel2Bottom.add(labela2, BorderLayout.CENTER);
        centarBottom.add(label, BorderLayout.CENTER);
        
        jMenuItemNewGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                panel1Centar.removeAll();
                panel2Centar.removeAll();
                initGame();
                
            }
        });
        
        repaint();
        validate();
        pack();
        setVisible(true);
    }
        
    JButton dugmic;
    String komanda;
    
    public ArrayList<Button> mSredisnjiDugmici;
    public ArrayList<Button> mPlayer1;
    public ArrayList<Button> mPlayer2;
    
    boolean player1;
    
    int brojac1;
    int brojac2;
    int brKlikova;
    int rezultat;
        
    public void initGame(){
        player1 = true;
        brKlikova = 0;
        brojac1 = 0;
        brojac2 = 0;
        
        Random r = new Random();
        int br = r.nextInt(200-50)+50;
        random = Integer.toString(br);
        rezultat = Integer.valueOf(random);
        label.setText(random);
        label.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        mSredisnjiDugmici = new ArrayList<Button>();
        mPlayer1 = new ArrayList<Button>();
        mPlayer2 = new ArrayList<Button>();
        
        centarCentar.removeAll();
        
        for (int i=0; i<20; i++){
            int bBr = r.nextInt(30-5)+5;
            Button dugmici = new Button(bBr);
            //dugmici.setmValue(bBr);
            mSredisnjiDugmici.add(dugmici);
            
            /*Collections.sort(mSredisnjiDugmici, new Comparator<Button>(){
                public int compare(Button b1, Button b2){                    
                }
            });
            Sortirati listu, tako da i prikazani dugmici budu sortirani od najmanjeg ka najvecem*/
            
            centarCentar.add(mSredisnjiDugmici.get(i).getmButton());
            
            komanda = String.valueOf(i);
            mSredisnjiDugmici.get(i).getmButton().setActionCommand(komanda);
            mSredisnjiDugmici.get(i).getmButton().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int indeksDugmica = Integer.valueOf(e.getActionCommand());
                    JButton but = (JButton) mSredisnjiDugmici.get(indeksDugmica).getmButton();
                    but.setVisible(false);
                    onClick(indeksDugmica);
                    
                }
            });
        }
        repaint();
    }
    
    
    
    public void onClick(int indeksDugmica){
        int val = mSredisnjiDugmici.get(indeksDugmica).getmValue();
        Button dugmic1 = new Button(val);
        
        
        if (player1 == true){
            player1 = false;
            mPlayer1.add(dugmic1);
            JButton dugmePrvo = mPlayer1.get(brojac1).getmButton();
            panel1Centar.add(dugmePrvo);
            dugmePrvo.setActionCommand(String.valueOf(brojac1));
            dugmePrvo.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(brKlikova >= 10 && player1){
                        player1=false;
                        int indeks = Integer.valueOf(e.getActionCommand());
                        Button element = new Button(mPlayer1.get(indeks).getmValue());
                        mSredisnjiDugmici.add(element);
                        element.getmButton().setEnabled(false);
                        centarCentar.add(element.getmButton());
                        mPlayer1.get(indeks).getmButton().setVisible(false);
                        rezultat -= mPlayer1.get(indeks).getmValue();
                        label.setText(String.valueOf(rezultat));
                        if (rezultat == 0){
                            JOptionPane.showMessageDialog(null, "Player 1 WON!");
                            panel1Centar.removeAll();
                            panel2Centar.removeAll();
                            repaint();
                        }
                        if (rezultat<0) {
                            JOptionPane.showMessageDialog(null, "Player 2 WON!");
                            panel1Centar.removeAll();
                            panel2Centar.removeAll();
                            repaint();
                        }
                    }
                }
            });
            brojac1 ++;
        }else{
            player1 = true;
            mPlayer2.add(dugmic1);
            JButton dugmeDrugo = mPlayer2.get(brojac2).getmButton();
            panel2Centar.add(dugmeDrugo);
            dugmeDrugo.setActionCommand(String.valueOf(brojac2+5));
            dugmeDrugo.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (brKlikova >= 10 && !player1){
                        player1=true;
                        int indeks = Integer.valueOf(e.getActionCommand());
                        indeks -= 5;
                        JButton but = mPlayer2.get(indeks).getmButton();
                        Button element = new Button(mPlayer2.get(indeks).getmValue());
                        element.getmButton().setEnabled(false);
                        mSredisnjiDugmici.add(element);
                        centarCentar.add(element.getmButton());
                        mPlayer2.get(indeks).getmButton().setVisible(false);
                        rezultat -= mPlayer2.get(indeks).getmValue();
                        label.setText(String.valueOf(rezultat));
                        if (rezultat == 0){
                            JOptionPane.showMessageDialog(null, "Player 2 WON!");
                            panel1Centar.removeAll();
                            panel2Centar.removeAll();
                            repaint();
                        }
                        if (rezultat<0) {
                            JOptionPane.showMessageDialog(null, "Player 1 WON!");
                            panel1Centar.removeAll();
                            panel2Centar.removeAll();
                            repaint();
                        }
                    }
                }
            });
            brojac2 ++;
        }
        
        repaint();
        
        brKlikova ++;
        
        if (brKlikova == 10) {
            mSredisnjiDugmici = new ArrayList<Button>();
            centarCentar.removeAll();
            centarCentar.setLayout(new GridLayout(10, 1));
            repaint();
            startGame();
        }
    }
    
    public void startGame(){
        
        
    }
    
}
