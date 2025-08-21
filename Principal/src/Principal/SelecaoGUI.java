package Principal;

import Classes.*;
import Inimigo.EscolheInimigo;
import Inimigo.TurnoInimigo;
import java.awt.Image;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class SelecaoGUI extends javax.swing.JFrame {
    private Personagem jogador;
    private Personagem inimigo;
    private int turno = 1;
        
    public SelecaoGUI() {
        initComponents();
        setLocationRelativeTo(null);
        String nomeImagem = "Bárbaro.png";
        java.net.URL imgURL = getClass().getResource("/imagens/" + nomeImagem);
     if (imgURL != null) {
            ImageIcon icon = new ImageIcon(imgURL);
            Image imagemRedimensionada = icon.getImage().getScaledInstance(70, 125, Image.SCALE_SMOOTH);
            jLabel3.setIcon(new ImageIcon(imagemRedimensionada));
        } else {
            System.err.println("Imagem do inimigo não encontrada: " + nomeImagem);
            jLabel3.setIcon(null);
        }
     nomeImagem = "Arqueiro.png";
        imgURL = getClass().getResource("/imagens/" + nomeImagem);
     if (imgURL != null) {
            ImageIcon icon = new ImageIcon(imgURL);
            Image imagemRedimensionada = icon.getImage().getScaledInstance(70, 125, Image.SCALE_SMOOTH);
            jLabel6.setIcon(new ImageIcon(imagemRedimensionada));
        } else {
            System.err.println("Imagem do inimigo não encontrada: " + nomeImagem);
            jLabel6.setIcon(null);
        }
     nomeImagem = "Druida.png";
        imgURL = getClass().getResource("/imagens/" + nomeImagem);
     if (imgURL != null) {
            ImageIcon icon = new ImageIcon(imgURL);
            Image imagemRedimensionada = icon.getImage().getScaledInstance(70, 125, Image.SCALE_SMOOTH);
            jLabel2.setIcon(new ImageIcon(imagemRedimensionada));
        } else {
            System.err.println("Imagem do inimigo não encontrada: " + nomeImagem);
            jLabel2.setIcon(null);
        }
     nomeImagem = "Ladino.png";
        imgURL = getClass().getResource("/imagens/" + nomeImagem);
     if (imgURL != null) {
            ImageIcon icon = new ImageIcon(imgURL);
            Image imagemRedimensionada = icon.getImage().getScaledInstance(70, 125, Image.SCALE_SMOOTH);
            jLabel5.setIcon(new ImageIcon(imagemRedimensionada));
        } else {
            System.err.println("Imagem do inimigo não encontrada: " + nomeImagem);
            jLabel5.setIcon(null);
        }
     nomeImagem = "Maga.png";
        imgURL = getClass().getResource("/imagens/" + nomeImagem);
     if (imgURL != null) {
            ImageIcon icon = new ImageIcon(imgURL);
            Image imagemRedimensionada = icon.getImage().getScaledInstance(70, 125, Image.SCALE_SMOOTH);
            jLabel4.setIcon(new ImageIcon(imagemRedimensionada));
        } else {
            System.err.println("Imagem do inimigo não encontrada: " + nomeImagem);
            jLabel4.setIcon(null);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        Ragnar = new javax.swing.JButton();
        Lilith = new javax.swing.JButton();
        Arthar = new javax.swing.JButton();
        Merlim = new javax.swing.JButton();
        Ankhler = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        jTextField1.setEditable(false);
        jTextField1.setText("Selecione o seu heroi");

        Ragnar.setText("Ragnar, o Bárbaro");
        Ragnar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RagnarActionPerformed(evt);
            }
        });

        Lilith.setText("Lilith, a Drúida");
        Lilith.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LilithActionPerformed(evt);
            }
        });

        Arthar.setText("Arthar, o Arqueiro");
        Arthar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArtharActionPerformed(evt);
            }
        });

        Merlim.setText("Merlim, a Maga");
        Merlim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MerlimActionPerformed(evt);
            }
        });

        Ankhler.setText("Ankhler, o Ladino");
        Ankhler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnkhlerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Ragnar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Merlim, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Ankhler, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Arthar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lilith, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ragnar)
                    .addComponent(Merlim)
                    .addComponent(Ankhler)
                    .addComponent(Arthar)
                    .addComponent(Lilith))
                .addContainerGap(203, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RagnarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RagnarActionPerformed
         Classes.Barbaro jogador = new Classes.Barbaro();
    BatalhaGUI batalha = null;
        try {
            batalha = new BatalhaGUI(jogador);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(SelecaoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    batalha.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_RagnarActionPerformed

    private void LilithActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LilithActionPerformed
        Classes.Druida jogador = new Classes.Druida();
    BatalhaGUI batalha = null;
        try {
            batalha = new BatalhaGUI(jogador);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(SelecaoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    batalha.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_LilithActionPerformed

    private void ArtharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArtharActionPerformed
        Classes.Arqueiro jogador = new Classes.Arqueiro();
    BatalhaGUI batalha = null;
        try {
            batalha = new BatalhaGUI(jogador);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(SelecaoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    batalha.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_ArtharActionPerformed

    private void MerlimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MerlimActionPerformed
        Classes.Mago jogador = new Classes.Mago();
    BatalhaGUI batalha = null;
        try {
            batalha = new BatalhaGUI(jogador);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(SelecaoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    batalha.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_MerlimActionPerformed

    private void AnkhlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnkhlerActionPerformed
        Classes.Ladino jogador = new Classes.Ladino();
    BatalhaGUI batalha = null;
        try {
            batalha = new BatalhaGUI(jogador);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(SelecaoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    batalha.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_AnkhlerActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new SelecaoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ankhler;
    private javax.swing.JButton Arthar;
    private javax.swing.JButton Lilith;
    private javax.swing.JButton Merlim;
    private javax.swing.JButton Ragnar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
