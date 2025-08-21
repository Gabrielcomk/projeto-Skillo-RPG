
package Principal;

import Inimigo.EscolheInimigo;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.nio.charset.StandardCharsets;

public class BatalhaGUI extends javax.swing.JFrame {
    private Classes.Personagem jogador;
    private Classes.Personagem inimigo;
    private int turno = 1;

    public BatalhaGUI(Classes.Personagem jogador) throws UnsupportedEncodingException {
    initComponents();
    this.jogador = jogador;
    this.inimigo = EscolheInimigo.escolheInimigo();
    setLocationRelativeTo(null);
    Acoes.setVisible(false);
    atualizarTela();
    Batalha.setText("Início da batalha!\n"
            + "Lembrando que qualquer numero acima de 9 é crítico!\n");
    
    OutputStream out = new OutputStream() {
    private final ByteArrayOutputStream buffer = new ByteArrayOutputStream();

    @Override
    public void write(int b) {
        if (b == '\n') {
            String linha = new String(buffer.toByteArray(), StandardCharsets.UTF_8);
            Batalha.append(linha + "\n");
            buffer.reset();
        } else {
            buffer.write(b);
        }
    }
};
System.setOut(new PrintStream(out, true, StandardCharsets.UTF_8));
    }

    private void atualizarTela() {
        nomeJogador.setText(jogador.getNome());
        classeJogador.setText("Classe: " + jogador.getClasse());
        jogadorVida.setText("HP: " + jogador.getVida());
        jogadorEnergia.setText("Energia: " + jogador.getEnergia());

        nomeInimigo.setText(inimigo.getNome());
        classeInimigo.setText("Classe: " + inimigo.getClasse());
        vidaInimigo.setText("HP: " + inimigo.getVida());
        energiaInimigo.setText("Energia: " + inimigo.getEnergia());

        Turno.setText("Turno: " + turno);

        String nomeImagem = inimigo.getClasse() + ".png";
        java.net.URL imgURL = getClass().getResource("/imagens/" + nomeImagem);

        if (imgURL != null) {
            ImageIcon icon = new ImageIcon(imgURL);
            Image imagemRedimensionada = icon.getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH);
            imagemInimigo.setIcon(new ImageIcon(imagemRedimensionada));
        } else {
            System.err.println("Imagem do inimigo não encontrada: " + nomeImagem);
            imagemInimigo.setIcon(null);
        }
        Acao2.setText(jogador.getEspecial());
        Batalha.append("Turno: " + turno + "\n");
        Batalha.setCaretPosition(Batalha.getDocument().getLength());
        if (jogador.getVida() <= 0){
            dispose();
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Batalha = new javax.swing.JTextArea();
        nomeJogador = new javax.swing.JTextField();
        classeJogador = new javax.swing.JTextField();
        jogadorEnergia = new javax.swing.JTextField();
        jogadorVida = new javax.swing.JTextField();
        vidaInimigo = new javax.swing.JTextField();
        classeInimigo = new javax.swing.JTextField();
        nomeInimigo = new javax.swing.JTextField();
        energiaInimigo = new javax.swing.JTextField();
        Turno = new javax.swing.JTextField();
        Acoes = new javax.swing.JInternalFrame();
        Acao1 = new javax.swing.JButton();
        Acao2 = new javax.swing.JButton();
        Lutar = new javax.swing.JButton();
        imagemInimigo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        Batalha.setEditable(false);
        Batalha.setColumns(20);
        Batalha.setRows(5);
        jScrollPane1.setViewportView(Batalha);

        nomeJogador.setEditable(false);
        nomeJogador.setText("Seu nome:");
        nomeJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeJogadorActionPerformed(evt);
            }
        });

        classeJogador.setEditable(false);
        classeJogador.setText("Sua classe:");

        jogadorEnergia.setEditable(false);
        jogadorEnergia.setText("Sua energia:");
        jogadorEnergia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogadorEnergiaActionPerformed(evt);
            }
        });

        jogadorVida.setEditable(false);
        jogadorVida.setText("Sua vida:");
        jogadorVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogadorVidaActionPerformed(evt);
            }
        });

        vidaInimigo.setEditable(false);
        vidaInimigo.setText("Sua vida:");
        vidaInimigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vidaInimigoActionPerformed(evt);
            }
        });

        classeInimigo.setEditable(false);
        classeInimigo.setText("Sua classe:");

        nomeInimigo.setEditable(false);
        nomeInimigo.setText("Seu nome:");

        energiaInimigo.setEditable(false);
        energiaInimigo.setText("Sua energia:");
        energiaInimigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                energiaInimigoActionPerformed(evt);
            }
        });

        Turno.setEditable(false);
        Turno.setText("Turno:");
        Turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TurnoActionPerformed(evt);
            }
        });

        Acoes.setVisible(true);

        Acao1.setText("Atacar");
        Acao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Acao1ActionPerformed(evt);
            }
        });

        Acao2.setText("AtaqueEspecial");
        Acao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Acao2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AcoesLayout = new javax.swing.GroupLayout(Acoes.getContentPane());
        Acoes.getContentPane().setLayout(AcoesLayout);
        AcoesLayout.setHorizontalGroup(
            AcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Acao1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Acao2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addContainerGap())
        );
        AcoesLayout.setVerticalGroup(
            AcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AcoesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(AcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Acao1)
                    .addComponent(Acao2))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        Lutar.setText("Lutar");
        Lutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LutarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imagemInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vidaInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(energiaInimigo)
                            .addComponent(classeInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Turno, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jogadorVida, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                        .addComponent(nomeJogador))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jogadorEnergia)
                                        .addComponent(classeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(Lutar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Acoes))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomeInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vidaInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagemInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(energiaInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(classeInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(classeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jogadorEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jogadorVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Turno, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(Lutar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Acoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jogadorEnergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogadorEnergiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jogadorEnergiaActionPerformed

    private void jogadorVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogadorVidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jogadorVidaActionPerformed

    private void vidaInimigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vidaInimigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vidaInimigoActionPerformed

    private void energiaInimigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_energiaInimigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_energiaInimigoActionPerformed

    private void nomeJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeJogadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeJogadorActionPerformed

    private void TurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TurnoActionPerformed

    private void LutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LutarActionPerformed
Acoes.setVisible(!Acoes.isVisible());
Lutar.setText(Lutar.getText().equals("Lutar") ? "Fechar" : "Lutar");
    }//GEN-LAST:event_LutarActionPerformed

    private void Acao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Acao1ActionPerformed
if(jogador.getVida() > 0 &&  Acao1.getText().equals("Atacar")){
    jogador.atacar(inimigo);
    if (inimigo.getVida() > 0){
        inimigo.atacar(jogador);
        turno++;
        atualizarTela();
    } else {
        atualizarTela();
        Batalha.setText(Batalha.getText() + "Você venceu!\n");
      }
}
    }//GEN-LAST:event_Acao1ActionPerformed

    private void Acao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Acao2ActionPerformed
        if(jogador.getVida() > 0 &&  Acao2.getText().equals(jogador.getEspecial())){
    jogador.ataqueEspecial(inimigo);
    if (inimigo.getVida() > 0){
        inimigo.atacar(jogador);
        turno++;
        atualizarTela();
    } else {
        atualizarTela();
        Batalha.setText(Batalha.getText() + "Você venceu!\n");
      }
}
    }//GEN-LAST:event_Acao2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acao1;
    private javax.swing.JButton Acao2;
    private javax.swing.JInternalFrame Acoes;
    private javax.swing.JTextArea Batalha;
    private javax.swing.JButton Lutar;
    private javax.swing.JTextField Turno;
    private javax.swing.JTextField classeInimigo;
    private javax.swing.JTextField classeJogador;
    private javax.swing.JTextField energiaInimigo;
    private javax.swing.JLabel imagemInimigo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jogadorEnergia;
    private javax.swing.JTextField jogadorVida;
    private javax.swing.JTextField nomeInimigo;
    private javax.swing.JTextField nomeJogador;
    private javax.swing.JTextField vidaInimigo;
    // End of variables declaration//GEN-END:variables
}
